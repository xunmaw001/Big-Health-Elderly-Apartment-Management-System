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

import com.entity.LaorendanganEntity;
import com.entity.view.LaorendanganView;

import com.service.LaorendanganService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 老人档案
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
@RestController
@RequestMapping("/laorendangan")
public class LaorendanganController {
    @Autowired
    private LaorendanganService laorendanganService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LaorendanganEntity laorendangan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("laoren")) {
			laorendangan.setXingming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LaorendanganEntity> ew = new EntityWrapper<LaorendanganEntity>();
		PageUtils page = laorendanganService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, laorendangan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LaorendanganEntity laorendangan, 
		HttpServletRequest request){
        EntityWrapper<LaorendanganEntity> ew = new EntityWrapper<LaorendanganEntity>();
		PageUtils page = laorendanganService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, laorendangan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LaorendanganEntity laorendangan){
       	EntityWrapper<LaorendanganEntity> ew = new EntityWrapper<LaorendanganEntity>();
      	ew.allEq(MPUtil.allEQMapPre( laorendangan, "laorendangan")); 
        return R.ok().put("data", laorendanganService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LaorendanganEntity laorendangan){
        EntityWrapper< LaorendanganEntity> ew = new EntityWrapper< LaorendanganEntity>();
 		ew.allEq(MPUtil.allEQMapPre( laorendangan, "laorendangan")); 
		LaorendanganView laorendanganView =  laorendanganService.selectView(ew);
		return R.ok("查询老人档案成功").put("data", laorendanganView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LaorendanganEntity laorendangan = laorendanganService.selectById(id);
        return R.ok().put("data", laorendangan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LaorendanganEntity laorendangan = laorendanganService.selectById(id);
        return R.ok().put("data", laorendangan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LaorendanganEntity laorendangan, HttpServletRequest request){
    	laorendangan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(laorendangan);

        laorendanganService.insert(laorendangan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LaorendanganEntity laorendangan, HttpServletRequest request){
    	laorendangan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(laorendangan);

        laorendanganService.insert(laorendangan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody LaorendanganEntity laorendangan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(laorendangan);
        laorendanganService.updateById(laorendangan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        laorendanganService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<LaorendanganEntity> wrapper = new EntityWrapper<LaorendanganEntity>();
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

		int count = laorendanganService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
