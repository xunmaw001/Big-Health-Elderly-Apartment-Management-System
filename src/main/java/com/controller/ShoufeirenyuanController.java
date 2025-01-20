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

import com.entity.ShoufeirenyuanEntity;
import com.entity.view.ShoufeirenyuanView;

import com.service.ShoufeirenyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 收费人员
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
@RestController
@RequestMapping("/shoufeirenyuan")
public class ShoufeirenyuanController {
    @Autowired
    private ShoufeirenyuanService shoufeirenyuanService;



    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		ShoufeirenyuanEntity user = shoufeirenyuanService.selectOne(new EntityWrapper<ShoufeirenyuanEntity>().eq("shoufeizhanghao", username));
		if(user==null || !user.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		String token = tokenService.generateToken(user.getId(), username,"shoufeirenyuan",  "收费人员" );
		return R.ok().put("token", token);
	}
	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody ShoufeirenyuanEntity shoufeirenyuan){
    	//ValidatorUtils.validateEntity(shoufeirenyuan);
    	ShoufeirenyuanEntity user = shoufeirenyuanService.selectOne(new EntityWrapper<ShoufeirenyuanEntity>().eq("shoufeizhanghao", shoufeirenyuan.getShoufeizhanghao()));
		if(user!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		shoufeirenyuan.setId(uId);
        shoufeirenyuanService.insert(shoufeirenyuan);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        ShoufeirenyuanEntity user = shoufeirenyuanService.selectById(id);
        return R.ok().put("data", user);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	ShoufeirenyuanEntity user = shoufeirenyuanService.selectOne(new EntityWrapper<ShoufeirenyuanEntity>().eq("shoufeizhanghao", username));
    	if(user==null) {
    		return R.error("账号不存在");
    	}
    	user.setMima("123456");
        shoufeirenyuanService.updateById(user);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShoufeirenyuanEntity shoufeirenyuan, 
		HttpServletRequest request){

        EntityWrapper<ShoufeirenyuanEntity> ew = new EntityWrapper<ShoufeirenyuanEntity>();
		PageUtils page = shoufeirenyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shoufeirenyuan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShoufeirenyuanEntity shoufeirenyuan, 
		HttpServletRequest request){
        EntityWrapper<ShoufeirenyuanEntity> ew = new EntityWrapper<ShoufeirenyuanEntity>();
		PageUtils page = shoufeirenyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shoufeirenyuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShoufeirenyuanEntity shoufeirenyuan){
       	EntityWrapper<ShoufeirenyuanEntity> ew = new EntityWrapper<ShoufeirenyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shoufeirenyuan, "shoufeirenyuan")); 
        return R.ok().put("data", shoufeirenyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShoufeirenyuanEntity shoufeirenyuan){
        EntityWrapper< ShoufeirenyuanEntity> ew = new EntityWrapper< ShoufeirenyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shoufeirenyuan, "shoufeirenyuan")); 
		ShoufeirenyuanView shoufeirenyuanView =  shoufeirenyuanService.selectView(ew);
		return R.ok("查询收费人员成功").put("data", shoufeirenyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShoufeirenyuanEntity shoufeirenyuan = shoufeirenyuanService.selectById(id);
        return R.ok().put("data", shoufeirenyuan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShoufeirenyuanEntity shoufeirenyuan = shoufeirenyuanService.selectById(id);
        return R.ok().put("data", shoufeirenyuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShoufeirenyuanEntity shoufeirenyuan, HttpServletRequest request){
    	shoufeirenyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shoufeirenyuan);
    	ShoufeirenyuanEntity user = shoufeirenyuanService.selectOne(new EntityWrapper<ShoufeirenyuanEntity>().eq("shoufeizhanghao", shoufeirenyuan.getShoufeizhanghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}

		shoufeirenyuan.setId(new Date().getTime());
        shoufeirenyuanService.insert(shoufeirenyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShoufeirenyuanEntity shoufeirenyuan, HttpServletRequest request){
    	shoufeirenyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shoufeirenyuan);
    	ShoufeirenyuanEntity user = shoufeirenyuanService.selectOne(new EntityWrapper<ShoufeirenyuanEntity>().eq("shoufeizhanghao", shoufeirenyuan.getShoufeizhanghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}

		shoufeirenyuan.setId(new Date().getTime());
        shoufeirenyuanService.insert(shoufeirenyuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShoufeirenyuanEntity shoufeirenyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shoufeirenyuan);
        shoufeirenyuanService.updateById(shoufeirenyuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shoufeirenyuanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShoufeirenyuanEntity> wrapper = new EntityWrapper<ShoufeirenyuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shoufeirenyuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
