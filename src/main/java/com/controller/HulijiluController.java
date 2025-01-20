package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HulijiluEntity;
import com.entity.view.HulijiluView;

import com.service.HulijiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 护理记录
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-10 10:39:40
 */
@RestController
@RequestMapping("/hulijilu")
public class HulijiluController {
    @Autowired
    private HulijiluService hulijiluService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HulijiluEntity hulijilu, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date hulishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date hulishijianend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laoren")) {
			hulijilu.setXingming((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("hulirenyuan")) {
			hulijilu.setHulizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HulijiluEntity> ew = new EntityWrapper<HulijiluEntity>();
                if(hulishijianstart!=null) ew.ge("hulishijian", hulishijianstart);
                if(hulishijianend!=null) ew.le("hulishijian", hulishijianend);
		PageUtils page = hulijiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hulijilu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HulijiluEntity hulijilu, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date hulishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date hulishijianend,
		HttpServletRequest request){
        EntityWrapper<HulijiluEntity> ew = new EntityWrapper<HulijiluEntity>();
                if(hulishijianstart!=null) ew.ge("hulishijian", hulishijianstart);
                if(hulishijianend!=null) ew.le("hulishijian", hulishijianend);
		PageUtils page = hulijiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hulijilu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HulijiluEntity hulijilu){
       	EntityWrapper<HulijiluEntity> ew = new EntityWrapper<HulijiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( hulijilu, "hulijilu")); 
        return R.ok().put("data", hulijiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HulijiluEntity hulijilu){
        EntityWrapper< HulijiluEntity> ew = new EntityWrapper< HulijiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( hulijilu, "hulijilu")); 
		HulijiluView hulijiluView =  hulijiluService.selectView(ew);
		return R.ok("查询护理记录成功").put("data", hulijiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HulijiluEntity hulijilu = hulijiluService.selectById(id);
        return R.ok().put("data", hulijilu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HulijiluEntity hulijilu = hulijiluService.selectById(id);
        return R.ok().put("data", hulijilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HulijiluEntity hulijilu, HttpServletRequest request){
    	hulijilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hulijilu);

        hulijiluService.insert(hulijilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HulijiluEntity hulijilu, HttpServletRequest request){
    	hulijilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hulijilu);

        hulijiluService.insert(hulijilu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HulijiluEntity hulijilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(hulijilu);
        hulijiluService.updateById(hulijilu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        hulijiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<HulijiluEntity> wrapper = new EntityWrapper<HulijiluEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laoren")) {
			wrapper.eq("xingming", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("hulirenyuan")) {
			wrapper.eq("hulizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = hulijiluService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
