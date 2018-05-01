<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>电脑特卖</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/layui.css">
    <%--<link rel="stylesheet" href="${pageContext.request.contextPath}/css/weadmin.css">--%>
    <style type="text/css">
        .lunbo {
            margin-top: 30px;
        }
        #test1{
            margin-top: 60px;
        }
    </style>


</head>
<body>
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">

        <div class="layui-logo"><i class="layui-icon">&#xe735;</i>&nbsp;电脑热卖</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href=""><i class="layui-icon">&#xe65c;</i>&nbsp;首页</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;"><i class="layui-icon">&#xe645;</i>&nbsp;公告栏</a>
                <dl class="layui-nav-child">
                    <dd><a href="">系统维护信息</a></dd>
                    <dd><a href="">电商大事件</a></dd>
                    <dd><a href="">...</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item">
                <a href="javascript:;"><i class="layui-icon">&#xe62a;</i>&nbsp;意见箱</a>
                <dl class="layui-nav-child">
                    <dd><a href="">说出你的建议或者意见</a></dd>
                    <dd><a href="">向他人分享你的电商经验</a></dd>
                    <dd><a href="">...</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="javascript:;">
                <i class="layui-icon">&#xe63d;</i>&nbsp;更多功能,敬请期待</a>
            </li>

        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    贤心
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退出登录</a></li>
        </ul>

    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <ul id="nav" class="layui-nav layui-nav-tree" lay-filter="test">
                <!-- 侧边导航: <ul class="layui-nav layui-nav-tree layui-nav-side"> -->
                <li class="layui-nav-item">
                    <a href="javascript:;"><i class="layui-icon">&#xe68e;</i>&nbsp;商品管理</a>
                    <dl class="layui-nav-child">
                        <ul class="sub-menu">
                            <li>
                                <a href="javascript:;"><i class="layui-icon">&#xe608;</i>&nbsp;<cite>上架商品</cite></a>
                            </li>
                            <li>
                                <a href="./manager/jsp/listProduct">
                                    <i class="layui-icon">&#xe642;</i>&nbsp;
                                    <cite>库存管理</cite>
                                </a>
                            </li>
                        </ul>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;"><i class="layui-icon">&#xe612;</i>&nbsp;用户管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;"><i class="layui-icon">&#xe642;</i>&nbsp;编辑用户</a></dd>
                        <li class="layui-nav-item">
                            <a href="javascript:;"><i class="layui-icon">&#xe613;</i>&nbsp;会员管理</a></dd>
                            <dl class="layui-nav-child">
                                <dd><a href=""><i class="layui-icon">&#xe63c;</i>&nbsp;会员信息</a></dd>
                                <dd><a href=""><i class="layui-icon">&#xe642;</i>&nbsp;编辑会员</a></dd>
                                <dd><a href=""><i class="layui-icon">&#xe63a;</i>&nbsp;生日祝福</a></dd>
                            </dl>
                        </li>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;"><i class="layui-icon">&#xe620;</i>&nbsp;分类管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;"><i class="layui-icon">&#xe608;</i>&nbsp;增加分类</a></dd>
                        <dd><a href="javascript:;"><i class="layui-icon">&#xe640;</i>&nbsp;删除分类</a></dd>
                        <dd><a href="javascript:;"><i class="layui-icon">&#xe6b2;</i>&nbsp;查询分类</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;"><i class="layui-icon">&#xe698;</i>&nbsp;订单管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;"><i class="layui-icon">&#xe63c;</i>&nbsp;查询订单</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;"><i class="layui-icon">&#xe629;</i>&nbsp;大数据</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;"><i class="layui-icon">&#xe65e;</i>&nbsp;利润分析</a></dd>
                        <dd><a href="javascript:;"><i class="layui-icon">&#xe6af;</i>&nbsp;用户喜好</a></dd>
                        <dd><a href="javascript:;"><i class="layui-icon">&#xe756;</i>&nbsp;热销品</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>
</div>
<!-- <div class="x-slide_left"></div> -->
<!-- 左侧菜单结束 -->
<!-- 轮播图开始 -->
<div class="layui-body">
    <div class="layui-carousel" id="test1">
        <div id="lunbo" carousel-item align="center">
            <div class="lunbo"><img width="70%" height="80%"
                                    src="${pageContext.request.contextPath}\images\lunbo\jixiegeming.png"></div>
            <div class="lunbo"><img width="70%" height="80%"
                                    src="${pageContext.request.contextPath}\images\lunbo\shenhaiyouling.png"></div>
            <div class="lunbo"><img width="70%" height="80%"
                                    src="${pageContext.request.contextPath}\images\lunbo\sirendingzhi.png"></div>
            <div class="lunbo"><img width="70%" height="80%"
                                    src="${pageContext.request.contextPath}\images\lunbo\yaomuzhizhan.png"></div>
            <div class="lunbo"><img width="70%" height="80%"
                                    src="${pageContext.request.contextPath}\images\lunbo\youxiben.png"></div>
        </div>
    </div>

</div>
<!-- 轮播图结束 -->
<!-- 右侧主体开始 -->
<div class="page-content">
    <div class="layui-tab tab" lay-filter="wenav_tab" id="WeTabTip" lay-allowclose="true">
        <ul class="layui-tab-title">
            <li>库存管理</li>
        </ul>
        <div class="layui-tab-content">
            <div class="layui-tab-item layui-show"/>
            <iframe src='${pageContext.request.contextPath}/manager/jsp/listProduct'
                    frameborder="0" scrolling="yes" class="weIframe"></iframe>
        </div>
    </div>
</div>
<%--<div class="page-content-bg"></div>--%>
<!-- 右侧主体结束 -->
<!-- 中部结束 -->
<!-- 底部开始 -->
<div class="footer">
    <div class="copyright">Copyright ©2018 Admin v1.0 All Rights Reserved</div>
</div>
<!-- 底部结束 -->

<div class="layui-footer">
    <!-- 底部固定区域 -->
    © eb.pcshop.com
</div>
</div>
<script src="${pageContext.request.contextPath}/js/layui.js"></script>
<script src="${pageContext.request.contextPath}/js/modules/jquery.js"></script>
<script>
    layui.use(['layer', 'form', 'element', 'jquery'], function () {
        var element = layui.element;
        var carousel = layui.carousel;
        var $ = layui.jquery;
        var form = layui.form;
        var layer = layui.layer;

        //一些事件监听
        element.on('tab(demo)', function (data) {
            console.log(data);
        });
    });

    layui.use('carousel', function () {
        var carousel = layui.carousel;
        //建造实例
        carousel.render({
            elem: '#test1'
            , width: '100%' //设置容器宽度
            , arrow: 'hover' //始终显示箭头
            , autoplay: true //自动轮播
            , height: '60%'
            , anim: 'fade'//切换方式
            , interval: '3000'//2.5秒轮播一次
            //,anim: 'updown' //切换动画方式
        });
    });
</script>

</body>

</html>
