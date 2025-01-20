import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import hulirenyuan from '@/views/modules/hulirenyuan/list'
    import shengritixing from '@/views/modules/shengritixing/list'
    import ruzhudengji from '@/views/modules/ruzhudengji/list'
    import jiedairenyuan from '@/views/modules/jiedairenyuan/list'
    import laorenyuyue from '@/views/modules/laorenyuyue/list'
    import jiedaidengji from '@/views/modules/jiedaidengji/list'
    import fangjianxinxi from '@/views/modules/fangjianxinxi/list'
    import hulijilu from '@/views/modules/hulijilu/list'
    import tuifangdengji from '@/views/modules/tuifangdengji/list'
    import laorenqingjia from '@/views/modules/laorenqingjia/list'
    import quxiaoyuyue from '@/views/modules/quxiaoyuyue/list'
    import chuangweixinxi from '@/views/modules/chuangweixinxi/list'
    import laoren from '@/views/modules/laoren/list'
    import shoufeirenyuan from '@/views/modules/shoufeirenyuan/list'
    import shoufeibiaozhun from '@/views/modules/shoufeibiaozhun/list'
    import laorendangan from '@/views/modules/laorendangan/list'
    import jiesuanqingdan from '@/views/modules/jiesuanqingdan/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/hulirenyuan',
        name: '护理人员',
        component: hulirenyuan
      }
      ,{
	path: '/shengritixing',
        name: '生日提醒',
        component: shengritixing
      }
      ,{
	path: '/ruzhudengji',
        name: '入住登记',
        component: ruzhudengji
      }
      ,{
	path: '/jiedairenyuan',
        name: '接待人员',
        component: jiedairenyuan
      }
      ,{
	path: '/laorenyuyue',
        name: '老人预约',
        component: laorenyuyue
      }
      ,{
	path: '/jiedaidengji',
        name: '接待登记',
        component: jiedaidengji
      }
      ,{
	path: '/fangjianxinxi',
        name: '房间信息',
        component: fangjianxinxi
      }
      ,{
	path: '/hulijilu',
        name: '护理记录',
        component: hulijilu
      }
      ,{
	path: '/tuifangdengji',
        name: '退房登记',
        component: tuifangdengji
      }
      ,{
	path: '/laorenqingjia',
        name: '老人请假',
        component: laorenqingjia
      }
      ,{
	path: '/quxiaoyuyue',
        name: '取消预约',
        component: quxiaoyuyue
      }
      ,{
	path: '/chuangweixinxi',
        name: '床位信息',
        component: chuangweixinxi
      }
      ,{
	path: '/laoren',
        name: '老人',
        component: laoren
      }
      ,{
	path: '/shoufeirenyuan',
        name: '收费人员',
        component: shoufeirenyuan
      }
      ,{
	path: '/shoufeibiaozhun',
        name: '收费标准',
        component: shoufeibiaozhun
      }
      ,{
	path: '/laorendangan',
        name: '老人档案',
        component: laorendangan
      }
      ,{
	path: '/jiesuanqingdan',
        name: '结算清单',
        component: jiesuanqingdan
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
