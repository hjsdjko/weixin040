(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-login-login"],{"21ff":function(t,e,n){var i=n("e49f");"string"===typeof i&&(i=[[t.i,i,""]]),i.locals&&(t.exports=i.locals);var r=n("4f06").default;r("28edead8",i,!0,{sourceMap:!1,shadowMode:!1})},3285:function(t,e,n){"use strict";n.r(e);var i=n("6263"),r=n.n(i);for(var a in i)"default"!==a&&function(t){n.d(e,t,(function(){return i[t]}))}(a);e["default"]=r.a},"4f6e":function(t,e,n){"use strict";var i=n("21ff"),r=n.n(i);r.a},6263:function(t,e,n){"use strict";var i=n("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,n("96cf");var r=i(n("3b8d")),a=i(n("2971")),o={data:function(){return{username:"",password:"",loginType:1,codes:[{num:1,color:"#000",rotate:"10deg",size:"16px"},{num:2,color:"#000",rotate:"10deg",size:"16px"},{num:3,color:"#000",rotate:"10deg",size:"16px"},{num:4,color:"#000",rotate:"10deg",size:"16px"}],options:["请选择登录用户类型"],optionsValues:["","yonghu"],inputCode:"",validateCode:"",index:1,roleNum:0}},onLoad:function(){var t=["请选择登录用户类型"],e=a.default.list();this.menuList=e;for(var n=0;n<this.menuList.length;n++)"是"==this.menuList[n].hasFrontLogin&&(t.push(this.menuList[n].roleName),this.roleNum++);1==this.roleNum&&(this.index=1),this.options=t,this.randomString(4),this.styleChange()},methods:{randomString:function(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:4,e=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"],n=["0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"],i=["28","30","32","34","36"];this.validateCode="";for(var r=0;r<t;r++){var a=Math.floor(Math.random()*e.length);this.codes[r].num=e[a],this.validateCode=this.validateCode+e[a];for(var o="#",s=0;s<6;s++){var d=Math.floor(Math.random()*n.length);o+=n[d]}this.codes[r].color=o;var u=Math.floor(30*Math.random()),p=Math.floor(2*Math.random());1==p&&(u="-"+u),this.codes[r].rotate="rotate("+u+"deg)";var c=Math.floor(Math.random()*i.length);this.codes[r].size=i[c]+"rpx"}},styleChange:function(){this.$nextTick((function(){}))},onRegisterTap:function(t){uni.setStorageSync("loginTable",t),this.$utils.jump("../register/register")},onLoginTap:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(){var e,n,i;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(this.username){t.next=3;break}return this.$utils.msg("请输入用户名"),t.abrupt("return");case 3:if(this.password){t.next=6;break}return this.$utils.msg("请输入用户密码"),t.abrupt("return");case 6:if(this.optionsValues[this.index]){t.next=9;break}return this.$utils.msg("请选择登录用户类型"),t.abrupt("return");case 9:if(e=JSON.parse(JSON.stringify(this.inputCode)).toLowerCase(),n=JSON.parse(JSON.stringify(this.validateCode)).toLowerCase(),e==n){t.next=14;break}return this.$utils.msg("请输入正确的验证码"),t.abrupt("return");case 14:return t.next=16,this.$api.login("".concat(this.optionsValues[this.index]),{username:this.username,password:this.password});case 16:return i=t.sent,uni.removeStorageSync("useridTag"),uni.setStorageSync("token",i.token),uni.setStorageSync("nickname",this.username),uni.setStorageSync("nowTable","".concat(this.optionsValues[this.index])),t.next=23,this.$api.session("".concat(this.optionsValues[this.index]));case 23:i=t.sent,i.data.touxiang?uni.setStorageSync("headportrait",i.data.touxiang):i.data.headportrait&&uni.setStorageSync("headportrait",i.data.headportrait),uni.setStorageSync("userid",i.data.id),i.data.vip&&uni.setStorageSync("vip",i.data.vip),uni.setStorageSync("appRole","".concat(this.options[this.index])),this.$utils.tab("../index/index");case 29:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),optionsChange:function(t){this.index=t.target.value}}};e.default=o},"92bc":function(t,e,n){"use strict";var i,r=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("v-uni-view",{staticClass:"content"},[n("v-uni-view",{staticClass:"box",style:{minHeight:"100vh",width:"100%",padding:"160rpx 44rpx 244rpx 44rpx",background:"url(http://clfile.zggen.cn/20231204/89b286cdb44c4f3e9a91bc90ff72c4e2.jpg) no-repeat center top / 100% 100%,#ffffff",height:"100%"}},[n("v-uni-view",{style:{padding:"48rpx 48rpx 48rpx 48rpx",boxShadow:"0px 0px 0px #dddddd",margin:"0 0 244rpx 0",borderRadius:"4rpx",background:"none",display:"block",width:"100%",position:"relative",height:"auto"}},[n("v-uni-image",{style:{width:"160rpx",margin:"0 0 40rpx 0",borderRadius:"100%",objectFit:"cover",display:"none",height:"160rpx"},attrs:{src:"http://clfile.zggen.cn/20231027/4b7b24d658fd400e849c8c2314e29d56.jpg",mode:"aspectFill"}}),1==t.loginType?n("v-uni-view",{staticClass:"uni-form-item uni-column",style:{width:"100%",margin:"0 0 24rpx 0",borderRadius:"40rpx",background:"#00000040",height:"auto"}},[n("v-uni-input",{staticClass:"uni-input",style:{border:"0px solid #00000010",padding:"0px 24rpx 0 24rpx",margin:"0 0 0 0",color:"#666",borderRadius:"60rpx",background:"#ffffff",width:"100%",fontSize:"28rpx",height:"80rpx"},attrs:{type:"text",name:"",placeholder:"请输入账号"},model:{value:t.username,callback:function(e){t.username=e},expression:"username"}})],1):t._e(),1==t.loginType?n("v-uni-view",{staticClass:"uni-form-item uni-column",style:{width:"100%",margin:"0 0 24rpx 0",borderRadius:"40rpx",background:"#00000040",height:"auto"}},[n("v-uni-input",{staticClass:"uni-input",style:{border:"0px solid #00000010",padding:"0px 24rpx 0 24rpx",margin:"0 0 0 0",color:"#666",borderRadius:"60rpx",background:"#ffffff",width:"100%",fontSize:"28rpx",height:"80rpx"},attrs:{type:"password",name:"",placeholder:"请输入密码"},model:{value:t.password,callback:function(e){t.password=e},expression:"password"}})],1):t._e(),1==t.loginType?n("v-uni-view",{staticClass:"code",style:{width:"100%",margin:"0 0 24rpx 0",flexWrap:"wrap",justifyContent:"space-between",display:"flex",height:"auto"}},[n("v-uni-input",{style:{border:"0px solid #00000010",padding:"0 24rpx 0 24rpx",margin:"0 0 0 0",color:"#666",borderRadius:"60rpx",background:"#ffffff",width:"calc(100% - 188rpx)",fontSize:"28rpx",height:"80rpx"},attrs:{type:"text",placeholder:"请输入验证码"},model:{value:t.inputCode,callback:function(e){t.inputCode=e},expression:"inputCode"}}),n("v-uni-view",{staticClass:"getCodeBt",style:{border:"0px solid #dddddd",padding:"0 0 0 0",margin:"0 0 0 0",alignItems:"center",borderRadius:"60rpx",background:"#5fb959",display:"flex",width:"168rpx",justifyContent:"center",height:"80rpx"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.randomString(4)}}},t._l(t.codes,(function(e,i){return n("v-uni-view",{key:i,style:{color:e.color,transform:e.rotate,fontSize:e.size,padding:"0 3px",display:"inline-block"}},[t._v(t._s(e.num))])})),1)],1):t._e(),t.roleNum>1?n("v-uni-picker",{style:{border:"0px solid #00000010",padding:"0 20rpx",margin:"0 0 24rpx 0",borderRadius:"60rpx",background:"#ffffff",width:"100%",height:"auto"},attrs:{value:t.index,range:t.options},on:{change:function(e){arguments[0]=e=t.$handleEvent(e),t.optionsChange.apply(void 0,arguments)}}},[n("v-uni-view",{staticClass:"uni-picker-type",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#999999"}},[t._v(t._s(t.options[t.index]))])],1):t._e(),1==t.loginType?n("v-uni-button",{staticClass:"btn-submit",style:{border:"0px solid #dddddd",padding:"0 0 0 0",margin:"0 0 24rpx 0",color:"#fff",borderRadius:"60rpx",background:"#d84fa9",width:"100%",lineHeight:"80rpx",fontSize:"32rpx",height:"80rpx"},attrs:{type:"primary"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onLoginTap.apply(void 0,arguments)}}},[t._v("登录")]):t._e(),2==t.loginType?n("v-uni-button",{staticClass:"btn-submit",style:{border:"0px solid #dddddd",padding:"0 0 0 0",margin:"0 0 24rpx 0",color:"#fff",borderRadius:"60rpx",background:"#d84fa9",width:"100%",lineHeight:"80rpx",fontSize:"32rpx",height:"80rpx"},attrs:{type:"primary"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onFaceLoginTap.apply(void 0,arguments)}}},[t._v("人脸识别登录")]):t._e(),n("v-uni-view",{staticClass:"links",style:{width:"100%",margin:"0 0 24rpx 0",flexWrap:"wrap",justifyContent:"space-between",display:"flex",height:"auto"}})],1)],1)],1)},a=[];n.d(e,"b",(function(){return r})),n.d(e,"c",(function(){return a})),n.d(e,"a",(function(){return i}))},a86a:function(t,e,n){"use strict";n.r(e);var i=n("92bc"),r=n("3285");for(var a in r)"default"!==a&&function(t){n.d(e,t,(function(){return r[t]}))}(a);n("4f6e");var o,s=n("f0c5"),d=Object(s["a"])(r["default"],i["b"],i["c"],!1,null,"3837c860",null,!1,i["a"],o);e["default"]=d.exports},e49f:function(t,e,n){var i=n("24fb");e=i(!1),e.push([t.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-3837c860]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),t.exports=e}}]);