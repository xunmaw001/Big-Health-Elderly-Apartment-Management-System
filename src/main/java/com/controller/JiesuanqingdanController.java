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

import com.entity.JiesuanqingdanEntity;
import com.entity.view.JiesuanqingdanView;

import com.service.JiesuanqingdanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 结算清单
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-10 10:39:40
 */
@RestController
@RequestMapping("/jiesuanqingdan")
public class JiesuanqingdanController {
    @Autowired
    private JiesuanqingdanService jiesuanqingdanService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiesuanqingdanEntity jiesuanqingdan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laoren")) {
			jiesuanqingdan.setXingming((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("shoufeirenyuan")) {
			jiesuanqingdan.setShoufeizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiesuanqingdanEntity> ew = new EntityWrapper<JiesuanqingdanEntity>();
		PageUtils page = jiesuanqingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiesuanqingdan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiesuanqingdanEntity jiesuanqingdan, 
		HttpServletRequest request){
        EntityWrapper<JiesuanqingdanEntity> ew = new EntityWrapper<JiesuanqingdanEntity>();
		PageUtils page = jiesuanqingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiesuanqingdan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiesuanqingdanEntity jiesuanqingdan){
       	EntityWrapper<JiesuanqingdanEntity> ew = new EntityWrapper<JiesuanqingdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiesuanqingdan, "jiesuanqingdan")); 
        return R.ok().put("data", jiesuanqingdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiesuanqingdanEntity jiesuanqingdan){
        EntityWrapper< JiesuanqingdanEntity> ew = new EntityWrapper< JiesuanqingdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiesuanqingdan, "jiesuanqingdan")); 
		JiesuanqingdanView jiesuanqingdanView =  jiesuanqingdanService.selectView(ew);
		return R.ok("查询结算清单成功").put("data", jiesuanqingdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiesuanqingdanEntity jiesuanqingdan = jiesuanqingdanService.selectById(id);
        return R.ok().put("data", jiesuanqingdan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiesuanqingdanEntity jiesuanqingdan = jiesuanqingdanService.selectById(id);
        return R.ok().put("data", jiesuanqingdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiesuanqingdanEntity jiesuanqingdan, HttpServletRequest request){
    	jiesuanqingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiesuanqingdan);

        jiesuanqingdanService.insert(jiesuanqingdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiesuanqingdanEntity jiesuanqingdan, HttpServletRequest request){
    	jiesuanqingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiesuanqingdan);

        jiesuanqingdanService.insert(jiesuanqingdan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JiesuanqingdanEntity jiesuanqingdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiesuanqingdan);
        jiesuanqingdanService.updateById(jiesuanqingdan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiesuanqingdanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JiesuanqingdanEntity> wrapper = new EntityWrapper<JiesuanqingdanEntity>();
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
		if(tableName.equals("shoufeirenyuan")) {
			wrapper.eq("shoufeizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jiesuanqingdanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
