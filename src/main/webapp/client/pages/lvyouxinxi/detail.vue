
<template>
<view>
<mescroll-uni @init="mescrollInit" :up="upOption" :down="downOption" @down="downCallback" @up="upCallback">
	<view class="content">
		<view class="container" :style='{"width":"100%","padding":"0px","position":"relative","background":"#ffffff","height":"auto"}'>
						<swiper :style='{"width":"100%","background":"#ffffff","height":"400rpx"}' class="swiper" :indicator-dots='true' :autoplay='true' :circular='true' indicator-active-color='#ff746d' indicator-color='#ffffff' :duration='500' :interval='5000' :vertical='false'>
				<swiper-item :style='{"width":"100%","textAlign":"center","background":"#ffffff","height":"100%"}' v-for="(swiper,index) in swiperList" :key="index">
					<img :style='{"width":"100%","padding":"0","objectFit":"contain","background":"#5fb95910","display":"block","height":"100%"}' mode="aspectFill" v-if="swiper.substring(0,4)=='http'" :src="swiper"></img>
					<img :style='{"width":"100%","padding":"0","objectFit":"contain","background":"#5fb95910","display":"block","height":"100%"}' mode="aspectFill" v-else :src="baseUrl+swiper"></img>
				</swiper-item>
			</swiper>
									            <view :style='{"padding":"24rpx 24rpx 24rpx 24rpx","flexWrap":"wrap","background":"#ffffff","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}' class="detail-content">
				<view v-if="detail.groupprice&&detail.groupprice>0&&detail.grouppeople>1" class="price detail-list-item priceFavor" :style='{"padding":"0 80rpx 0 72rpx","margin":"0 0 0px 0","borderColor":"#f0b8dd","borderRadius":"0px 0 0 0px","borderWidth":"0 0 2rpx 0","background":"url(http://clfile.zggen.cn/20231201/929f7c0aed824bb3959e8ba0641392c8.gif) no-repeat center center / 100%","display":"block","width":"100%","borderStyle":"dotted","justifyContent":"space-between","height":"88rpx"}'>
					<view class="text" :style='{"width":"calc(100% - 100rpx)","float":"left","display":"flex"}'>
						<view :style='{"color":"#ff0000","lineHeight":"104rpx","fontSize":"32rpx"}'>￥</view>
						<view :style='{"color":"#ff0000","lineHeight":"104rpx","fontSize":"36rpx"}'>{{Number(detail.groupprice).toFixed(2)}}拼团价</view>
						<view class="text" :style='{"padding":"0px 0 0 0","margin":"0 0 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#666666","flex":"1"}'>{{detail.grouppeople}}人团(仅差{{detail.grouppeople-detail.curpeople}}人成团)</view>
					</view>
				</view>
				<view v-if="detail.grouppeople>1" class="detail-list-item" :style='{"margin":"16rpx 0 16rpx 0","borderColor":"#f0b8dd","flexWrap":"wrap","borderWidth":"0 0 2rpx 0","background":"#ffffff","display":"flex","width":"100%","borderStyle":"dotted","height":"auto"}'>
					<view class="lable" :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#5fb959","textAlign":"right"}'>成团人数：</view>
					<view class="text" :style='{"padding":"0px 0 0 0","margin":"0 0 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#666666","flex":"1"}'>{{detail.grouppeople}}人团(仅差{{detail.grouppeople-detail.curpeople}}人成团)</view>
				</view>
				<view :style='{"padding":"0 80rpx 0 72rpx","margin":"0 0 0px 0","borderColor":"#f0b8dd","borderRadius":"0px 0 0 0px","borderWidth":"0 0 2rpx 0","background":"url(http://clfile.zggen.cn/20231201/929f7c0aed824bb3959e8ba0641392c8.gif) no-repeat center center / 100%","display":"block","width":"100%","borderStyle":"dotted","justifyContent":"space-between","height":"88rpx"}' class="detail-list-item price priceFavor">
					<view :style='{"width":"calc(100% - 100rpx)","float":"left","display":"flex"}' class="text">
						<view :style='{"color":"#ff0000","lineHeight":"104rpx","fontSize":"32rpx"}'>￥</view>
						<view :style='{"color":"#ff0000","lineHeight":"104rpx","fontSize":"36rpx"}'>{{Number(detail.price).toFixed(2)}}</view>
					</view>
				</view>

				<view :style='{"margin":"16rpx 0 16rpx 0","borderColor":"#f0b8dd","flexWrap":"wrap","borderWidth":"0 0 2rpx 0","background":"#ffffff","display":"flex","width":"100%","borderStyle":"dotted","height":"auto"}' class="detail-list-item title">
					<view :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#5fb959","textAlign":"right"}' class="lable">目的地：</view>
					<view :style='{"padding":"0px 0 0 0","margin":"0 0 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#666666","flex":"1"}' class="text">{{detail.mudedi}}</view>
				</view>
				<view :style='{"margin":"16rpx 0 16rpx 0","borderColor":"#f0b8dd","flexWrap":"wrap","borderWidth":"0 0 2rpx 0","background":"#ffffff","display":"flex","width":"100%","borderStyle":"dotted","height":"auto"}' class="detail-list-item title">
					<view :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#5fb959","textAlign":"right"}' class="lable">旅游时间：</view>
					<view :style='{"padding":"0px 0 0 0","margin":"0 0 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#666666","flex":"1"}' class="text">{{detail.lvyoushijian}}</view>
				</view>

				<view class="detail-list-item" :style='{"margin":"16rpx 0 16rpx 0","borderColor":"#f0b8dd","flexWrap":"wrap","borderWidth":"0 0 2rpx 0","background":"#ffffff","display":"flex","width":"100%","borderStyle":"dotted","height":"auto"}'>
					<view class="lable" :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#5fb959","textAlign":"right"}'>交通方式：</view>
					<view  class="text" :style='{"padding":"0px 0 0 0","margin":"0 0 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#666666","flex":"1"}'>{{detail.jiaotongfangshi}}</view>
				</view>
				<view class="detail-list-item" :style='{"margin":"16rpx 0 16rpx 0","borderColor":"#f0b8dd","flexWrap":"wrap","borderWidth":"0 0 2rpx 0","background":"#ffffff","display":"flex","width":"100%","borderStyle":"dotted","height":"auto"}'>
					<view class="lable" :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#5fb959","textAlign":"right"}'>住宿：</view>
					<view  class="text" :style='{"padding":"0px 0 0 0","margin":"0 0 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#666666","flex":"1"}'>{{detail.zhusu}}</view>
				</view>
				<view class="detail-list-item" :style='{"margin":"16rpx 0 16rpx 0","borderColor":"#f0b8dd","flexWrap":"wrap","borderWidth":"0 0 2rpx 0","background":"#ffffff","display":"flex","width":"100%","borderStyle":"dotted","height":"auto"}'>
					<view class="lable" :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#5fb959","textAlign":"right"}'>景点推荐：</view>
					<view  class="text" :style='{"padding":"0px 0 0 0","margin":"0 0 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#666666","flex":"1"}'>{{detail.jingdiantuijian}}</view>
				</view>



				<view class="detail-list-item" :style='{"margin":"16rpx 0 16rpx 0","borderColor":"#f0b8dd","flexWrap":"wrap","borderWidth":"0 0 2rpx 0","background":"#ffffff","display":"flex","width":"100%","borderStyle":"dotted","height":"auto"}'>
					<view class="lable" :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#5fb959","textAlign":"right"}'>注意事项</view>
					<view class="text" :style='{"padding":"0px 0 0 0","margin":"0 0 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#666666","flex":"1"}'>{{detail.zhuyishixiang}}</view>
				</view>

				<view v-if="userid" class="detail-list-item" :style='{"margin":"16rpx 0 16rpx 0","borderColor":"#f0b8dd","flexWrap":"wrap","borderWidth":"0 0 2rpx 0","background":"#ffffff","display":"flex","width":"100%","borderStyle":"dotted","height":"auto"}'>
					<view class="lable" :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#5fb959","textAlign":"right"}'>审核状态：</view>
					<view v-if="detail.sfsh=='是'" class="text" :style='{"padding":"0px 0 0 0","margin":"0 0 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#666666","flex":"1"}'>通过</view>
					<view v-if="detail.sfsh=='否'" class="text" :style='{"padding":"0px 0 0 0","margin":"0 0 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#666666","flex":"1"}'>不通过</view>
					<view v-if="detail.sfsh=='待审核'" class="text" :style='{"padding":"0px 0 0 0","margin":"0 0 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#666666","flex":"1"}'>待审核</view>
				</view>
				<view v-if="userid" class="detail-list-item" :style='{"margin":"16rpx 0 16rpx 0","borderColor":"#f0b8dd","flexWrap":"wrap","borderWidth":"0 0 2rpx 0","background":"#ffffff","display":"flex","width":"100%","borderStyle":"dotted","height":"auto"}'>
					<view class="lable" :style='{"width":"auto","padding":"0 20rpx 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#5fb959","textAlign":"right"}'>审核回复</view>
					<view class="text" :style='{"padding":"0px 0 0 0","margin":"0 0 0 0","lineHeight":"60rpx","fontSize":"28rpx","color":"#666666","flex":"1"}'>{{detail.shhf}}</view>
				</view>




				<view class="bottom-content bg-white tabbar border shop" :style='{"padding":"0","margin":"20rpx 0 0","flexWrap":"wrap","background":"none","display":"flex","width":"100%","height":"auto"}'>

					<button :style='{"border":"0","padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","color":"#fff","background":"#ffaa33","width":"auto","fontSize":"28rpx","height":"80rpx"}'  @tap="onBuyTap">立即购买</button>
					<button :style='{"border":"0","padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","color":"#fff","background":"#ffaa33","width":"auto","fontSize":"28rpx","height":"80rpx"}' v-if="!detail.curpeople&&detail.grouppeople>1" @tap="onGroupBuyTap">我要开团</button>
					<button :style='{"border":"0","padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","color":"#fff","background":"#ffaa33","width":"auto","fontSize":"28rpx","height":"80rpx"}' v-if="detail.curpeople&&detail.grouppeople>1" @tap="onGroupBuyTap">去参团</button>
					<button :style='{"border":"0","padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","color":"#fff","background":"#ffaa33","width":"auto","fontSize":"28rpx","height":"80rpx"}' v-if="userid&&isAuth('lvyouxinxi','审核')" @tap="onSHTap">审核</button>
					<button :style='{"border":"0","padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","color":"#fff","background":"#ffaa33","width":"auto","fontSize":"28rpx","height":"80rpx"}' v-if="!userid&&isAuthFront('lvyouxinxi','审核')" @tap="onSHTap">审核</button>
				</view>
			</view>

			<!-- 确认完成弹窗 -->
			<uni-popup class="popup-content" ref="popup" type="center">
				<form class="popup-form" style="background: #fff;width: 300px;display: block;border-radius: 10px;padding: 20px;text-align: center;">
					<view class=" margin-top">
						<picker @change="sfshChange" :value="sfshIndex" :range="sfshOptions">
							<view class="uni-input">{{detail.sfsh?detail.sfsh:'选择审核结果'}}</view>
						</picker>
					</view>
					<view class="">
						<!-- <view class="title">审核回复</view> -->
						<textarea style="width: 200px;" v-model="detail.shhf" placeholder="审核回复"></textarea>
						<!-- <input v-model="douyinId" placeholder="审核回复" name="input"></input> -->
					</view>
					<view class="btn-content">
						<button style="margin: 0 10px" @tap="onCloseWinTap" class="cu-btn bg-cyan">取消</button>
						<button style="margin: 0 10px" @tap="onFinishTap" class="cu-btn bg-red">确认</button>
					</view>
				</form>
			</uni-popup>
		</view>
	</view>
</mescroll-uni>
</view>
</template>

<script>
	export default {
		data() {
			return {
				btnColor: ['#409eff','#67c23a','#909399','#e6a23c','#f56c6c','#356c6c','#351c6c','#f093a9','#a7c23a','#104eff','#10441f','#a21233','#503319'],
				id: '',
                userid: '',
				detail: {},
				swiperList: [],
				commentList: [],
				mescroll: null, //mescroll实例对象
				downOption: {
					auto: false //是否在初始化后,自动执行下拉回调callback; 默认true
				},
				upOption: {
					noMoreSize: 3, //如果列表已无数据,可设置列表的总数量要大于半页才显示无更多数据;避免列表数据过少(比如只有一条数据),显示无更多数据会不好看; 默认5
					textNoMore: '~ 没有更多了 ~',
				},
				hasNext: true,
				user: null,
				sfshIndex: -1,
				sfshOptions: ['通过','不通过', '待审核'],
				count: 0,
				timer: null
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		async onLoad(options) {
			this.id = options.id;
            if(options.userid) {
                this.userid = options.userid;
            }
			// 渲染数据
			this.init();
		},
        onUnload() {
            if(this.timer) {
                clearInterval(this.timer);
            }
        },
		async onShow(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			this.btnColor = this.btnColor.sort(()=> {
				return (0.5-Math.random());
			});
			let crossCleanType = uni.getStorageSync('crossCleanType')
            if(crossCleanType) {
				uni.removeStorageSync('crossCleanType')
                res = await this.$api.info('lvyouxinxi', this.id);
                this.detail = res.data;
            }
		},
		destroyed: function() {
			//window.clearInterval(this.inter);
		},
		methods: {
			// 支付
			onPayTap(){
				uni.setStorageSync('paytable','lvyouxinxi');
				uni.setStorageSync('payObject',this.detail);
				this.$utils.jump('../pay-confirm/pay-confirm?type=1')
			},
            onDetailTap(item) {
                uni.setStorageSync("useridTag",this.userid);
                this.$utils.jump(`./detail?id=${item.id}&userid=`+this.userid)
            },
			// 跨表
			onAcrossTap(tableName,crossOptAudit,statusColumnName,tips,statusColumnValue){
				if(!this.user){
					
					return false
				}
				if(crossOptAudit=='是'&&this.detail.sfsh!='是') {
					this.$utils.msg("请审核通过后再操作");
					return
				}
				uni.setStorageSync('crossTable','lvyouxinxi');
				uni.setStorageSync(`crossObj`, this.detail);
				uni.setStorageSync(`statusColumnName`, statusColumnName);
				uni.setStorageSync(`statusColumnValue`, statusColumnValue);
				uni.setStorageSync(`tips`, tips);
				if(statusColumnName!=''&&!statusColumnName.startsWith("[")) {
					var obj = uni.getStorageSync('crossObj');
					for (var o in obj){
						if(o==statusColumnName && obj[o]==statusColumnValue){
							this.$utils.msg(tips);
							return
						}
					}
				}
				this.$utils.jump(`../${tableName}/add-or-update?cross=true`);
			},
			// 获取详情
			async init(){
                if(this.timer) {
                    clearInterval(this.timer);
                }
				let res = await this.$api.info('lvyouxinxi', this.id);
				this.detail = res.data;
				// 轮播图片
				this.swiperList = this.detail.tupian ? this.detail.tupian.split(",") : [];
			},

			// mescroll组件初始化的回调,可获取到mescroll对象
			mescrollInit(mescroll) {
				this.mescroll = mescroll;
			},

			/*下拉刷新的回调 */
			downCallback(mescroll) {
				this.hasNext = true
				mescroll.resetUpScroll()
			},

			/*上拉加载的回调: mescroll携带page的参数, 其中num:当前页 从1开始, size:每页数据条数,默认10 */
			async upCallback(mescroll) {
				mescroll.endSuccess(mescroll.size, this.hasNext);

            },

            onBuyTap() {
				if(!this.user){
					
					return false
				}
				uni.setStorageSync('orderGoods', [{
					tablename: 'lvyouxinxi',
					goodid: this.detail.id,
					goodname: this.detail.mudedi,
					picture: this.swiperList[0],
					buynumber: 1,
					price: this.detail.price,
					discountprice: this.detail.vipprice
				}])
				this.$utils.jump('../shop-order-confirm/shop-order-confirm?type=1');
			},

            async onGroupBuyTap() {
				if(!this.user){
					
					return false
				}
                let params = {
                    goodid: this.detail.id,
                    userid: this.user.id,
                    status: '拼团中',
                    page: 1,
                    limit: 1,
                }
                let res = await this.$api.list('orders', params);
                if(res.data.list.length==1) {
					this.$utils.msg('您已参团')
                    return
                }
				uni.setStorageSync('orderGoods', [{
					tablename: 'lvyouxinxi',
					goodid: this.detail.id,
					goodname: this.detail.mudedi,
					picture: this.swiperList[0],
					buynumber: 1,
					price: this.detail.groupprice,
                    grouppeople: this.detail.grouppeople,
                    curpeople: this.detail.curpeople,
				}])
				this.$utils.jump('../shop-order-confirm/shop-order-confirm?type=3');
			},

			onChatTap() {
				this.$utils.jump('../chat/chat')
			},
			// 下载
			download(url){
				let _this = this;
				url=_this.$base.url +  url;
				uni.downloadFile({
					url: url,
					success: (res) => {
						if (res.statusCode === 200) {
							_this.$utils.msg('下载成功');
							 window.open(url);
						}
					}
				});
			},
			//
			onCartTabTap() {
				this.$utils.tab('../shop-cart/shop-cart')
			},
			// 添加评论
			async onCommentTap() {
				if(!this.user){
					
					return false
				}
                let params = {
                    page: 1,
                    limit: 1,
					status: '已完成',
					goodid: this.detail.id
                }
                let res = await this.$api.page('orders', params);
                if (res.data.list.length == 0) {
                this.$utils.msg('请完成订单后再评论');
					return;
				}
				this.$utils.jump(`../discusslvyouxinxi/add-or-update?refid=${this.id}`)
			},
			onSHTap() {
				if(!this.user){
					
					return false
				}
				this.$refs.popup.open()
			},
			// 完成审核
			async onFinishTap() {
				if(!this.detail.sfsh){
					this.$utils.msg('请选择审核状态');
					return
				}
				if(!this.detail.shhf){
					this.$utils.msg('请填写审核回复');
					return
				}
				if(this.detail.sfsh=="通过"){
					this.detail.sfsh = '是'
				}
				if(this.detail.sfsh=="不通过"){
					this.detail.sfsh = '否'
				}
				if(this.detail.sfsh=="待审核"){
					this.detail.sfsh = '待审核'
				}
				await this.$api.update('lvyouxinxi', this.detail);
				this.$utils.msg('审核成功');
				this.$refs.popup.close();
			},
			// 关闭窗口
			onCloseWinTap() {
				this.$refs.popup.close()
			},
			sfshChange(e){
				console.log(this.detail)
				this.sfshIndex = e.target.value
				this.detail.sfsh = this.sfshOptions[this.sfshIndex]
			},
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
	
	.seat-list {
		display: flex;
		align-items: center;
		flex-wrap: wrap;
		background: #FFFFFF;
		margin: 20upx;
		border-radius: 20upx;
		padding: 20upx;
		font-size: 30upx;
		.seat-item {
			width: 33.33%;
			display: flex;
			align-items: center;
			flex-direction: column;
			margin-bottom: 20upx;
	
			.seat-icon {
				width: 50upx;
				height: 50upx;
				margin-bottom: 10upx;
			}
		}
	}
	
	audio {
		display: flex;
		flex-direction: column;
	}
	
	.audio /deep/ .uni-audio-default {
		width: inherit;
	}
</style>
