(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-shop-order-shop-order"],{"2c95":function(e,t,n){var r=n("24fb");t=r(!1),t.push([e.i,".cover[data-v-7a1d9d2c]{width:%?150?%;height:%?150?%}",""]),e.exports=t},"2ede":function(e,t,n){"use strict";var r=n("b103"),s=n.n(r);s.a},"95a9":function(e,t,n){"use strict";n.r(t);var r=n("a7ae"),s=n("b92d");for(var i in s)"default"!==i&&function(e){n.d(t,e,(function(){return s[e]}))}(i);n("2ede");var a,u=n("f0c5"),c=Object(u["a"])(s["default"],r["b"],r["c"],!1,null,"7a1d9d2c",null,!1,r["a"],a);t["default"]=c.exports},a7ae:function(e,t,n){"use strict";var r={"mescroll-uni":n("f05e").default},s=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("v-uni-view",[n("v-uni-scroll-view",{staticClass:"bg-white nav",attrs:{"scroll-x":!0}},[n("v-uni-view",{staticClass:"flex text-center"},e._l(e.navlist,(function(t,r){return n("v-uni-view",{key:r,staticClass:"cu-item flex-sub text-df ",class:[r==e.currentIndex?"text-red cur":""],on:{click:function(n){arguments[0]=n=e.$handleEvent(n),e.navselect(r,t)}}},[e._v(e._s(t))])})),1)],1),n("mescroll-uni",{attrs:{top:88,up:e.upOption,down:e.downOption},on:{init:function(t){arguments[0]=t=e.$handleEvent(t),e.mescrollInit.apply(void 0,arguments)},down:function(t){arguments[0]=t=e.$handleEvent(t),e.downCallback.apply(void 0,arguments)},up:function(t){arguments[0]=t=e.$handleEvent(t),e.upCallback.apply(void 0,arguments)}}},e._l(e.list,(function(t,r){return n("v-uni-view",{key:r},[n("v-uni-view",{staticClass:"bg-white margin-sm padding-sm solids-bottom radius text-content"},[n("v-uni-view",{staticClass:"flex justify-between"},[n("v-uni-view",{staticClass:"text-bold",staticStyle:{"flex-shrink":"0"}},[n("v-uni-text",{staticClass:"text-red"},[e._v(e._s("未支付"==t.status?"未支付":""))]),n("v-uni-text",{staticClass:"text-green"},[e._v(e._s("已支付"==t.status?"已支付":""))]),n("v-uni-text",{staticClass:"text-green"},[e._v(e._s("拼团中"==t.status?"拼团中":""))]),n("v-uni-text",{staticClass:"text-red"},[e._v(e._s("已发货"==t.status?"已发货":""))]),n("v-uni-text",{staticClass:"text-blue"},[e._v(e._s("已完成"==t.status?"已完成":""))]),n("v-uni-text",{staticClass:"text-grey"},[e._v(e._s("已取消"==t.status?"已取消":""))]),n("v-uni-text",{staticClass:"text-grey"},[e._v(e._s("已退款"==t.status?"已退款":""))])],1),n("v-uni-view",[n("v-uni-text",{staticClass:"icon-goods padding-right-sm"}),n("v-uni-text",{staticClass:"text-bold solids-bottom"},[e._v(e._s(t.orderid))])],1)],1),n("v-uni-view",{staticClass:"bg-white margin-xs padding-xs  radius text-content"},[n("v-uni-view",{staticClass:"flex padding-top-sm solids-top"},[n("v-uni-image",{staticClass:" cover radius solids",staticStyle:{"flex-shrink":"0"},attrs:{src:e.baseUrl+t.picture,mode:"aspectFill"}}),n("v-uni-view",{staticClass:"text-content padding-left",staticStyle:{"flex-grow":"1"}},[n("v-uni-view",[e._v(e._s(t.goodname))]),1==t.type||3==t.type?n("v-uni-view",[e._v(e._s(t.buynumber)+" x ￥"+e._s(e.priceChange(t.price)))]):e._e(),2==t.type?n("v-uni-view",[e._v(e._s(t.buynumber)+" x "+e._s(e.priceChange(t.price))+"积分")]):e._e(),n("v-uni-view",{staticClass:"flex justify-end"},[e._v("下单时间："+e._s(t.addtime))]),n("v-uni-view",{staticClass:"flex justify-end"},[e._v("备注："+e._s(t.remark))])],1)],1),1==t.type||3==t.type?n("v-uni-view",{staticClass:"flex justify-end"},[e._v("合计"+e._s(e.priceChange(t.total))+"元")]):e._e(),2==t.type?n("v-uni-view",{staticClass:"flex justify-end"},[e._v("合计"+e._s(t.total)+"积分")]):e._e()],1),n("v-uni-view",{staticClass:"flex justify-end"}),n("v-uni-view",{staticClass:"flex justify-end",staticStyle:{"font-size":"24upx"}},["未支付"==t.status?n("v-uni-view",[n("v-uni-view",{staticClass:"round cu-btn lines-grey mid  margin-right-sm",on:{click:function(n){arguments[0]=n=e.$handleEvent(n),e.pay(t)}}},[e._v("支付")]),n("v-uni-view",{staticClass:"round cu-btn lines-grey mid  margin-right-sm",on:{click:function(n){arguments[0]=n=e.$handleEvent(n),e.cancel(t)}}},[e._v("取消订单")])],1):e._e(),"已支付"==t.status?n("v-uni-view",[n("v-uni-view",{staticClass:"round cu-btn lines-grey mid  margin-right-sm",on:{click:function(n){arguments[0]=n=e.$handleEvent(n),e.onCancelTap(t)}}},[e._v("退款")])],1):e._e(),"拼团中"==t.status?n("v-uni-view",[n("v-uni-view",{staticClass:"round cu-btn lines-grey mid  margin-right-sm",on:{click:function(n){arguments[0]=n=e.$handleEvent(n),e.cancelGroup(t)}}},[e._v("取消拼团")])],1):e._e(),"已完成"==t.status?n("v-uni-view",[n("v-uni-view",{staticClass:"round cu-btn lines-grey mid  margin-right-sm",on:{click:function(n){arguments[0]=n=e.$handleEvent(n),e.returnGood(t)}}},[e._v("退货")])],1):e._e(),"已发货"==t.status?n("v-uni-view",[n("v-uni-view",{staticClass:"round cu-btn lines-grey mid  margin-right-sm",on:{click:function(n){arguments[0]=n=e.$handleEvent(n),e.onConfirm(t)}}},[e._v("确认收货")])],1):e._e(),"已取消"==t.status||"已完成"==t.status||"已退款"==t.status?n("v-uni-view",[n("v-uni-view",{staticClass:"round cu-btn lines-grey mid  margin-right-sm",on:{click:function(n){arguments[0]=n=e.$handleEvent(n),e.del(t.id)}}},[e._v("删除订单")])],1):e._e(),t.logistics?n("v-uni-view",{staticClass:"round cu-btn lines-grey mid  margin-right-sm",on:{click:function(n){arguments[0]=n=e.$handleEvent(n),e.logistics(t)}}},[e._v("物流")]):e._e()],1)],1)],1)})),1)],1)},i=[];n.d(t,"b",(function(){return s})),n.d(t,"c",(function(){return i})),n.d(t,"a",(function(){return r}))},b103:function(e,t,n){var r=n("2c95");"string"===typeof r&&(r=[[e.i,r,""]]),r.locals&&(e.exports=r.locals);var s=n("4f06").default;s("24959f6f",r,!0,{sourceMap:!1,shadowMode:!1})},b92d:function(e,t,n){"use strict";n.r(t);var r=n("f911"),s=n.n(r);for(var i in r)"default"!==i&&function(e){n.d(t,e,(function(){return r[e]}))}(i);t["default"]=s.a},f911:function(e,t,n){"use strict";var r=n("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,n("96cf");var s=r(n("3b8d"));n("c5f6");var i={data:function(){return{navlist:["全部","未支付","已支付","已完成","已取消","已退款"],currentIndex:0,pages:1,list:[],mescroll:null,downOption:{auto:!1},upOption:{page:{},noMoreSize:3,textNoMore:"~ 没有更多了 ~"},hasNext:!0,status:"",user:""}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(e){if(e.status)for(var t in this.navlist)if(this.navlist[t]==e.status){0!=t&&(this.currentIndex=Number(t),this.status=this.navlist[t]);break}},onShow:function(){var e=(0,s.default)(regeneratorRuntime.mark((function e(){var t,n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(t);case 3:n=e.sent,this.user=n.data,this.hasNext=!0,this.mescroll&&this.mescroll.resetUpScroll();case 7:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),methods:{navselect:function(e,t){this.currentIndex=e,this.status="全部"==t?"":"已支付"==t?"已支付":t,this.hasNext=!0,this.mescroll&&this.mescroll.resetUpScroll()},priceChange:function(e){return Number(e).toFixed(2)},mescrollInit:function(e){this.mescroll=e},downCallback:function(e){this.hasNext=!0,e.resetUpScroll()},upCallback:function(){var e=(0,s.default)(regeneratorRuntime.mark((function e(t){var n,r;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return n={page:t.num,limit:t.size,sort:"addtime",order:"desc"},this.status&&(n["status"]=this.status),e.next=4,this.$api.page("orders",n);case 4:r=e.sent,1==t.num&&(this.list=[]),this.list=this.list.concat(r.data.list),0==r.data.list.length&&(this.hasNext=!1),t.endSuccess(t.size,this.hasNext);case 9:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}(),onCancelTap:function(){var e=(0,s.default)(regeneratorRuntime.mark((function e(t){var n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:n=this,uni.showModal({title:"提示",content:"是否确认退款",success:function(){var e=(0,s.default)(regeneratorRuntime.mark((function e(r){var s;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(s=uni.getStorageSync("nowTable"),!r.confirm){e.next=10;break}return t.status="已退款",e.next=5,n.$api.update("orders",t);case 5:e.sent,n.hasNext=!0,n.mescroll&&n.mescroll.resetUpScroll(),1==t.type||3==t.type?n.user.money=Number(n.user.money)+Number(t.total):2==t.type&&(n.user.jf=Number(n.user.jf)+Number(t.total)),n.$api.update(s,n.user);case 10:case"end":return e.stop()}}),e)})));function r(t){return e.apply(this,arguments)}return r}()});case 2:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}(),logistics:function(e){this.$utils.jump("./logistics?id="+e.id)},returnGood:function(){var e=(0,s.default)(regeneratorRuntime.mark((function e(t){var n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:n=this,uni.showModal({title:"提示",content:"是否确认退货",success:function(){var e=(0,s.default)(regeneratorRuntime.mark((function e(r){var s;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(s=uni.getStorageSync("nowTable"),!r.confirm){e.next=10;break}return t.status="已退款",e.next=5,n.$api.update("orders",t);case 5:e.sent,n.hasNext=!0,n.mescroll&&n.mescroll.resetUpScroll(),1==t.type||3==t.type?n.user.money=Number(n.user.money)+Number(t.total):2==t.type&&(n.user.jf=Number(n.user.jf)+Number(t.total)),n.$api.update(s,n.user);case 10:case"end":return e.stop()}}),e)})));function r(t){return e.apply(this,arguments)}return r}()});case 2:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}(),cancelGroup:function(){var e=(0,s.default)(regeneratorRuntime.mark((function e(t){var n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:n=this,uni.showModal({title:"提示",content:"是否取消拼团",success:function(){var e=(0,s.default)(regeneratorRuntime.mark((function e(r){var s,i,a;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(s=uni.getStorageSync("nowTable"),!r.confirm){e.next=19;break}return e.next=4,n.$api.info(t.tablename,t.goodid);case 4:return i=e.sent,a=i.data,a.curpeople=a.curpeople-1,e.next=9,n.$api.update(t.tablename,a);case 9:return i=e.sent,t.status="已退款",e.next=13,n.$api.update("orders",t);case 13:i=e.sent,n.hasNext=!0,n.mescroll&&n.mescroll.resetUpScroll(),n.user.money=Number(n.user.money)+Number(t.total),a.jf&&(n.user.jf=Number(n.user.jf)-Number(t.total)),n.$api.update(s,n.user);case 19:case"end":return e.stop()}}),e)})));function r(t){return e.apply(this,arguments)}return r}()});case 2:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}(),cancel:function(){var e=(0,s.default)(regeneratorRuntime.mark((function e(t){var n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:n=this,uni.showModal({title:"提示",content:"是否取消订单",success:function(){var e=(0,s.default)(regeneratorRuntime.mark((function e(r){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!r.confirm){e.next=7;break}return t.status="已取消",e.next=4,n.$api.update("orders",t);case 4:e.sent,n.hasNext=!0,n.mescroll&&n.mescroll.resetUpScroll();case 7:case"end":return e.stop()}}),e)})));function r(t){return e.apply(this,arguments)}return r}()});case 2:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}(),pay:function(){var e=(0,s.default)(regeneratorRuntime.mark((function e(t){var n,r;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:n=this,r=uni.getStorageSync("nowTable"),uni.showModal({title:"提示",content:"是否支付订单",success:function(){var e=(0,s.default)(regeneratorRuntime.mark((function e(s){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!s.confirm){e.next=25;break}if(1!=t.type){e.next=12;break}if(!(n.user.money-t.total<0)){e.next=5;break}return n.$utils.msg("余额不足，请先充值"),e.abrupt("return");case 5:return n.$utils.msgBack("支付成功"),n.user.money=n.user.money-t.total,(n.user.jf||0==n.user.jf)&&(n.user.jf=parseFloat(n.user.jf)+parseFloat(t.total)),e.next=10,n.$api.update(r,n.user);case 10:e.next=20;break;case 12:if(2!=t.type){e.next=20;break}if(!(n.user.jf-t.total<0)){e.next=16;break}return n.$utils.msg("积分不足，兑换商品失败"),e.abrupt("return");case 16:return n.$utils.msgBack("兑换成功"),n.user.jf=n.user.jf-t.total,e.next=20,n.$api.update(r,n.user);case 20:return t.status="已支付",e.next=23,n.$api.update("orders",t);case 23:e.sent,n.mescroll&&n.mescroll.resetUpScroll();case 25:case"end":return e.stop()}}),e)})));function i(t){return e.apply(this,arguments)}return i}()});case 3:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}(),onConfirm:function(){var e=(0,s.default)(regeneratorRuntime.mark((function e(t){var n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:n=this,uni.showModal({title:"提示",content:"是否确认收货",success:function(){var e=(0,s.default)(regeneratorRuntime.mark((function e(r){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(uni.getStorageSync("nowTable"),!r.confirm){e.next=8;break}return t.status="已完成",e.next=5,n.$api.update("orders",t);case 5:e.sent,n.hasNext=!0,n.mescroll&&n.mescroll.resetUpScroll();case 8:case"end":return e.stop()}}),e)})));function r(t){return e.apply(this,arguments)}return r}()});case 2:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}(),del:function(){var e=(0,s.default)(regeneratorRuntime.mark((function e(t){var n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:n=this,uni.showModal({title:"提示",content:"是否确认删除",success:function(){var e=(0,s.default)(regeneratorRuntime.mark((function e(r){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!r.confirm){e.next=6;break}return e.next=3,n.$api.del("orders",JSON.stringify([t]));case 3:e.sent,n.mescroll&&n.mescroll.resetUpScroll(),n.$utils.msg("删除成功");case 6:case"end":return e.stop()}}),e)})));function r(t){return e.apply(this,arguments)}return r}()});case 2:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}()}};t.default=i}}]);