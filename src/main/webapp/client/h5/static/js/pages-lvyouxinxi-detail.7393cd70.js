(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-lvyouxinxi-detail"],{"3cdf":function(t,e,i){"use strict";i.r(e);var r=i("a9f9"),n=i("5845");for(var a in n)"default"!==a&&function(t){i.d(e,t,(function(){return n[t]}))}(a);i("6c64");var s,o=i("f0c5"),l=Object(o["a"])(n["default"],r["b"],r["c"],!1,null,"2997ac14",null,!1,r["a"],s);e["default"]=l.exports},5845:function(t,e,i){"use strict";i.r(e);var r=i("73a5"),n=i.n(r);for(var a in r)"default"!==a&&function(t){i.d(e,t,(function(){return r[t]}))}(a);e["default"]=n.a},"6a06":function(t,e,i){var r=i("fdc2");"string"===typeof r&&(r=[[t.i,r,""]]),r.locals&&(t.exports=r.locals);var n=i("4f06").default;n("4fe52d98",r,!0,{sourceMap:!1,shadowMode:!1})},"6c64":function(t,e,i){"use strict";var r=i("6a06"),n=i.n(r);n.a},"73a5":function(t,e,i){"use strict";var r=i("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,i("28a5"),i("f559"),i("55dd"),i("96cf");var n=r(i("3b8d")),a={data:function(){return{btnColor:["#409eff","#67c23a","#909399","#e6a23c","#f56c6c","#356c6c","#351c6c","#f093a9","#a7c23a","#104eff","#10441f","#a21233","#503319"],id:"",userid:"",detail:{},swiperList:[],commentList:[],mescroll:null,downOption:{auto:!1},upOption:{noMoreSize:3,textNoMore:"~ 没有更多了 ~"},hasNext:!0,user:null,sfshIndex:-1,sfshOptions:["通过","不通过","待审核"],count:0,timer:null}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(e){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:this.id=e.id,e.userid&&(this.userid=e.userid),this.init();case 3:case"end":return t.stop()}}),t,this)})));function e(e){return t.apply(this,arguments)}return e}(),onUnload:function(){this.timer&&clearInterval(this.timer)},onShow:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(e){var i,r,n;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return i=uni.getStorageSync("nowTable"),t.next=3,this.$api.session(i);case 3:if(r=t.sent,this.user=r.data,this.btnColor=this.btnColor.sort((function(){return.5-Math.random()})),n=uni.getStorageSync("crossCleanType"),!n){t.next=13;break}return uni.removeStorageSync("crossCleanType"),t.next=11,this.$api.info("lvyouxinxi",this.id);case 11:r=t.sent,this.detail=r.data;case 13:case"end":return t.stop()}}),t,this)})));function e(e){return t.apply(this,arguments)}return e}(),destroyed:function(){},methods:{onPayTap:function(){uni.setStorageSync("paytable","lvyouxinxi"),uni.setStorageSync("payObject",this.detail),this.$utils.jump("../pay-confirm/pay-confirm?type=1")},onDetailTap:function(t){uni.setStorageSync("useridTag",this.userid),this.$utils.jump("./detail?id=".concat(t.id,"&userid=")+this.userid)},onAcrossTap:function(t,e,i,r,n){if(!this.user)return!1;if("是"!=e||"是"==this.detail.sfsh){if(uni.setStorageSync("crossTable","lvyouxinxi"),uni.setStorageSync("crossObj",this.detail),uni.setStorageSync("statusColumnName",i),uni.setStorageSync("statusColumnValue",n),uni.setStorageSync("tips",r),""!=i&&!i.startsWith("[")){var a=uni.getStorageSync("crossObj");for(var s in a)if(s==i&&a[s]==n)return void this.$utils.msg(r)}this.$utils.jump("../".concat(t,"/add-or-update?cross=true"))}else this.$utils.msg("请审核通过后再操作")},init:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(){var e;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return this.timer&&clearInterval(this.timer),t.next=3,this.$api.info("lvyouxinxi",this.id);case 3:e=t.sent,this.detail=e.data,this.swiperList=this.detail.tupian?this.detail.tupian.split(","):[];case 6:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),mescrollInit:function(t){this.mescroll=t},downCallback:function(t){this.hasNext=!0,t.resetUpScroll()},upCallback:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(e){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:e.endSuccess(e.size,this.hasNext);case 1:case"end":return t.stop()}}),t,this)})));function e(e){return t.apply(this,arguments)}return e}(),onBuyTap:function(){if(!this.user)return!1;uni.setStorageSync("orderGoods",[{tablename:"lvyouxinxi",goodid:this.detail.id,goodname:this.detail.mudedi,picture:this.swiperList[0],buynumber:1,price:this.detail.price,discountprice:this.detail.vipprice}]),this.$utils.jump("../shop-order-confirm/shop-order-confirm?type=1")},onGroupBuyTap:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(){var e,i;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(this.user){t.next=2;break}return t.abrupt("return",!1);case 2:return e={goodid:this.detail.id,userid:this.user.id,status:"拼团中",page:1,limit:1},t.next=5,this.$api.list("orders",e);case 5:if(i=t.sent,1!=i.data.list.length){t.next=9;break}return this.$utils.msg("您已参团"),t.abrupt("return");case 9:uni.setStorageSync("orderGoods",[{tablename:"lvyouxinxi",goodid:this.detail.id,goodname:this.detail.mudedi,picture:this.swiperList[0],buynumber:1,price:this.detail.groupprice,grouppeople:this.detail.grouppeople,curpeople:this.detail.curpeople}]),this.$utils.jump("../shop-order-confirm/shop-order-confirm?type=3");case 11:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),onChatTap:function(){this.$utils.jump("../chat/chat")},download:function(t){var e=this;t=e.$base.url+t,uni.downloadFile({url:t,success:function(i){200===i.statusCode&&(e.$utils.msg("下载成功"),window.open(t))}})},onCartTabTap:function(){this.$utils.tab("../shop-cart/shop-cart")},onCommentTap:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(){var e,i;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(this.user){t.next=2;break}return t.abrupt("return",!1);case 2:return e={page:1,limit:1,status:"已完成",goodid:this.detail.id},t.next=5,this.$api.page("orders",e);case 5:if(i=t.sent,0!=i.data.list.length){t.next=9;break}return this.$utils.msg("请完成订单后再评论"),t.abrupt("return");case 9:this.$utils.jump("../discusslvyouxinxi/add-or-update?refid=".concat(this.id));case 10:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),onSHTap:function(){if(!this.user)return!1;this.$refs.popup.open()},onFinishTap:function(){var t=(0,n.default)(regeneratorRuntime.mark((function t(){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(this.detail.sfsh){t.next=3;break}return this.$utils.msg("请选择审核状态"),t.abrupt("return");case 3:if(this.detail.shhf){t.next=6;break}return this.$utils.msg("请填写审核回复"),t.abrupt("return");case 6:return"通过"==this.detail.sfsh&&(this.detail.sfsh="是"),"不通过"==this.detail.sfsh&&(this.detail.sfsh="否"),"待审核"==this.detail.sfsh&&(this.detail.sfsh="待审核"),t.next=11,this.$api.update("lvyouxinxi",this.detail);case 11:this.$utils.msg("审核成功"),this.$refs.popup.close();case 13:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),onCloseWinTap:function(){this.$refs.popup.close()},sfshChange:function(t){console.log(this.detail),this.sfshIndex=t.target.value,this.detail.sfsh=this.sfshOptions[this.sfshIndex]}}};e.default=a},a9f9:function(t,e,i){"use strict";var r={"mescroll-uni":i("f05e").default,"uni-popup":i("1c89").default},n=function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("v-uni-view",[i("mescroll-uni",{attrs:{up:t.upOption,down:t.downOption},on:{init:function(e){arguments[0]=e=t.$handleEvent(e),t.mescrollInit.apply(void 0,arguments)},down:function(e){arguments[0]=e=t.$handleEvent(e),t.downCallback.apply(void 0,arguments)},up:function(e){arguments[0]=e=t.$handleEvent(e),t.upCallback.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"content"},[i("v-uni-view",{staticClass:"container",style:{width:"100%",padding:"0px",position:"relative",background:"#ffffff",height:"auto"}},[i("v-uni-swiper",{staticClass:"swiper",style:{width:"100%",background:"#ffffff",height:"400rpx"},attrs:{"indicator-dots":!0,autoplay:!0,circular:!0,"indicator-active-color":"#ff746d","indicator-color":"#ffffff",duration:500,interval:5e3,vertical:!1}},t._l(t.swiperList,(function(e,r){return i("v-uni-swiper-item",{key:r,style:{width:"100%",textAlign:"center",background:"#ffffff",height:"100%"}},["http"==e.substring(0,4)?i("img",{style:{width:"100%",padding:"0",objectFit:"contain",background:"#5fb95910",display:"block",height:"100%"},attrs:{mode:"aspectFill",src:e}}):i("img",{style:{width:"100%",padding:"0",objectFit:"contain",background:"#5fb95910",display:"block",height:"100%"},attrs:{mode:"aspectFill",src:t.baseUrl+e}})])})),1),i("v-uni-view",{staticClass:"detail-content",style:{padding:"24rpx 24rpx 24rpx 24rpx",flexWrap:"wrap",background:"#ffffff",display:"flex",width:"100%",justifyContent:"space-between",height:"auto"}},[t.detail.groupprice&&t.detail.groupprice>0&&t.detail.grouppeople>1?i("v-uni-view",{staticClass:"price detail-list-item priceFavor",style:{padding:"0 80rpx 0 72rpx",margin:"0 0 0px 0",borderColor:"#f0b8dd",borderRadius:"0px 0 0 0px",borderWidth:"0 0 2rpx 0",background:"url(http://clfile.zggen.cn/20231201/929f7c0aed824bb3959e8ba0641392c8.gif) no-repeat center center / 100%",display:"block",width:"100%",borderStyle:"dotted",justifyContent:"space-between",height:"88rpx"}},[i("v-uni-view",{staticClass:"text",style:{width:"calc(100% - 100rpx)",float:"left",display:"flex"}},[i("v-uni-view",{style:{color:"#ff0000",lineHeight:"104rpx",fontSize:"32rpx"}},[t._v("￥")]),i("v-uni-view",{style:{color:"#ff0000",lineHeight:"104rpx",fontSize:"36rpx"}},[t._v(t._s(Number(t.detail.groupprice).toFixed(2))+"拼团价")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v(t._s(t.detail.grouppeople)+"人团(仅差"+t._s(t.detail.grouppeople-t.detail.curpeople)+"人成团)")])],1)],1):t._e(),t.detail.grouppeople>1?i("v-uni-view",{staticClass:"detail-list-item",style:{margin:"16rpx 0 16rpx 0",borderColor:"#f0b8dd",flexWrap:"wrap",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"dotted",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#5fb959",textAlign:"right"}},[t._v("成团人数：")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v(t._s(t.detail.grouppeople)+"人团(仅差"+t._s(t.detail.grouppeople-t.detail.curpeople)+"人成团)")])],1):t._e(),i("v-uni-view",{staticClass:"detail-list-item price priceFavor",style:{padding:"0 80rpx 0 72rpx",margin:"0 0 0px 0",borderColor:"#f0b8dd",borderRadius:"0px 0 0 0px",borderWidth:"0 0 2rpx 0",background:"url(http://clfile.zggen.cn/20231201/929f7c0aed824bb3959e8ba0641392c8.gif) no-repeat center center / 100%",display:"block",width:"100%",borderStyle:"dotted",justifyContent:"space-between",height:"88rpx"}},[i("v-uni-view",{staticClass:"text",style:{width:"calc(100% - 100rpx)",float:"left",display:"flex"}},[i("v-uni-view",{style:{color:"#ff0000",lineHeight:"104rpx",fontSize:"32rpx"}},[t._v("￥")]),i("v-uni-view",{style:{color:"#ff0000",lineHeight:"104rpx",fontSize:"36rpx"}},[t._v(t._s(Number(t.detail.price).toFixed(2)))])],1)],1),i("v-uni-view",{staticClass:"detail-list-item title",style:{margin:"16rpx 0 16rpx 0",borderColor:"#f0b8dd",flexWrap:"wrap",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"dotted",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#5fb959",textAlign:"right"}},[t._v("目的地：")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v(t._s(t.detail.mudedi))])],1),i("v-uni-view",{staticClass:"detail-list-item title",style:{margin:"16rpx 0 16rpx 0",borderColor:"#f0b8dd",flexWrap:"wrap",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"dotted",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#5fb959",textAlign:"right"}},[t._v("旅游时间：")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v(t._s(t.detail.lvyoushijian))])],1),i("v-uni-view",{staticClass:"detail-list-item",style:{margin:"16rpx 0 16rpx 0",borderColor:"#f0b8dd",flexWrap:"wrap",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"dotted",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#5fb959",textAlign:"right"}},[t._v("交通方式：")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v(t._s(t.detail.jiaotongfangshi))])],1),i("v-uni-view",{staticClass:"detail-list-item",style:{margin:"16rpx 0 16rpx 0",borderColor:"#f0b8dd",flexWrap:"wrap",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"dotted",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#5fb959",textAlign:"right"}},[t._v("住宿：")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v(t._s(t.detail.zhusu))])],1),i("v-uni-view",{staticClass:"detail-list-item",style:{margin:"16rpx 0 16rpx 0",borderColor:"#f0b8dd",flexWrap:"wrap",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"dotted",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#5fb959",textAlign:"right"}},[t._v("景点推荐：")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v(t._s(t.detail.jingdiantuijian))])],1),i("v-uni-view",{staticClass:"detail-list-item",style:{margin:"16rpx 0 16rpx 0",borderColor:"#f0b8dd",flexWrap:"wrap",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"dotted",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#5fb959",textAlign:"right"}},[t._v("注意事项")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v(t._s(t.detail.zhuyishixiang))])],1),t.userid?i("v-uni-view",{staticClass:"detail-list-item",style:{margin:"16rpx 0 16rpx 0",borderColor:"#f0b8dd",flexWrap:"wrap",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"dotted",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#5fb959",textAlign:"right"}},[t._v("审核状态：")]),"是"==t.detail.sfsh?i("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v("通过")]):t._e(),"否"==t.detail.sfsh?i("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v("不通过")]):t._e(),"待审核"==t.detail.sfsh?i("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v("待审核")]):t._e()],1):t._e(),t.userid?i("v-uni-view",{staticClass:"detail-list-item",style:{margin:"16rpx 0 16rpx 0",borderColor:"#f0b8dd",flexWrap:"wrap",borderWidth:"0 0 2rpx 0",background:"#ffffff",display:"flex",width:"100%",borderStyle:"dotted",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{width:"auto",padding:"0 20rpx 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#5fb959",textAlign:"right"}},[t._v("审核回复")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px 0 0 0",margin:"0 0 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#666666",flex:"1"}},[t._v(t._s(t.detail.shhf))])],1):t._e(),i("v-uni-view",{staticClass:"bottom-content bg-white tabbar border shop",style:{padding:"0",margin:"20rpx 0 0",flexWrap:"wrap",background:"none",display:"flex",width:"100%",height:"auto"}},[i("v-uni-button",{style:{border:"0",padding:"0 20rpx 0 20rpx",margin:"0 0 0 0",color:"#fff",background:"#ffaa33",width:"auto",fontSize:"28rpx",height:"80rpx"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onBuyTap.apply(void 0,arguments)}}},[t._v("立即购买")]),!t.detail.curpeople&&t.detail.grouppeople>1?i("v-uni-button",{style:{border:"0",padding:"0 20rpx 0 20rpx",margin:"0 0 0 0",color:"#fff",background:"#ffaa33",width:"auto",fontSize:"28rpx",height:"80rpx"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onGroupBuyTap.apply(void 0,arguments)}}},[t._v("我要开团")]):t._e(),t.detail.curpeople&&t.detail.grouppeople>1?i("v-uni-button",{style:{border:"0",padding:"0 20rpx 0 20rpx",margin:"0 0 0 0",color:"#fff",background:"#ffaa33",width:"auto",fontSize:"28rpx",height:"80rpx"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onGroupBuyTap.apply(void 0,arguments)}}},[t._v("去参团")]):t._e(),t.userid&&t.isAuth("lvyouxinxi","审核")?i("v-uni-button",{style:{border:"0",padding:"0 20rpx 0 20rpx",margin:"0 0 0 0",color:"#fff",background:"#ffaa33",width:"auto",fontSize:"28rpx",height:"80rpx"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onSHTap.apply(void 0,arguments)}}},[t._v("审核")]):t._e(),!t.userid&&t.isAuthFront("lvyouxinxi","审核")?i("v-uni-button",{style:{border:"0",padding:"0 20rpx 0 20rpx",margin:"0 0 0 0",color:"#fff",background:"#ffaa33",width:"auto",fontSize:"28rpx",height:"80rpx"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onSHTap.apply(void 0,arguments)}}},[t._v("审核")]):t._e()],1)],1),i("uni-popup",{ref:"popup",staticClass:"popup-content",attrs:{type:"center"}},[i("v-uni-form",{staticClass:"popup-form",staticStyle:{background:"#fff",width:"300px",display:"block","border-radius":"10px",padding:"20px","text-align":"center"}},[i("v-uni-view",{staticClass:" margin-top"},[i("v-uni-picker",{attrs:{value:t.sfshIndex,range:t.sfshOptions},on:{change:function(e){arguments[0]=e=t.$handleEvent(e),t.sfshChange.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"uni-input"},[t._v(t._s(t.detail.sfsh?t.detail.sfsh:"选择审核结果"))])],1)],1),i("v-uni-view",{},[i("v-uni-textarea",{staticStyle:{width:"200px"},attrs:{placeholder:"审核回复"},model:{value:t.detail.shhf,callback:function(e){t.$set(t.detail,"shhf",e)},expression:"detail.shhf"}})],1),i("v-uni-view",{staticClass:"btn-content"},[i("v-uni-button",{staticClass:"cu-btn bg-cyan",staticStyle:{margin:"0 10px"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onCloseWinTap.apply(void 0,arguments)}}},[t._v("取消")]),i("v-uni-button",{staticClass:"cu-btn bg-red",staticStyle:{margin:"0 10px"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onFinishTap.apply(void 0,arguments)}}},[t._v("确认")])],1)],1)],1)],1)],1)],1)],1)},a=[];i.d(e,"b",(function(){return n})),i.d(e,"c",(function(){return a})),i.d(e,"a",(function(){return r}))},fdc2:function(t,e,i){var r=i("24fb");e=r(!1),e.push([t.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-2997ac14]{min-height:calc(100vh - 44px);box-sizing:border-box}.seat-list[data-v-2997ac14]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;background:#fff;margin:%?20?%;border-radius:%?20?%;padding:%?20?%;font-size:%?30?%}.seat-list .seat-item[data-v-2997ac14]{width:33.33%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;margin-bottom:%?20?%}.seat-list .seat-item .seat-icon[data-v-2997ac14]{width:%?50?%;height:%?50?%;margin-bottom:%?10?%}uni-audio[data-v-2997ac14]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column}.audio[data-v-2997ac14] .uni-audio-default{width:inherit}',""]),t.exports=e}}]);