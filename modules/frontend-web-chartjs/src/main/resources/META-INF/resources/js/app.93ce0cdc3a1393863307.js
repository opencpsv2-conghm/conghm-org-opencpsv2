webpackJsonp([11],{124:function(n,e,t){function o(n){var e=i[n];return e?t.e(e[1]).then(function(){return t(e[0])}):Promise.reject(new Error("Cannot find module '"+n+"'."))}var i={"./BarChartReport.vue":[192,7],"./BarChartReportHorizontal.vue":[193,6],"./Landing.vue":[197,2],"./LandingLinePublic.vue":[198,1],"./LandingPiePublic.vue":[199,0],"./LineChartReport.vue":[194,3],"./NotFound.vue":[200,8],"./PieChartReport.vue":[195,5],"./PieChartReportPublic.vue":[196,4]};o.keys=function(){return Object.keys(i)},n.exports=o,o.id=124},125:function(n,e){n.exports={xyz:"FrontendPublicChartjs, FrontendWebChartjs",renderURLInit:"?p_p_id=FrontendPublicChartjs&p_p_lifecycle=2&p_p_state=exclusive&p_p_mode=view&p_p_resource_id=renderURLInit",trangThaiHoSoList:[{code:"0",active:!1,type:"thong_ke",title:"TÌNH HÌNH GIẢI QUYẾT TTHC"},{code:"1",active:!1,type:"dossier",title:"TỔNG HỢP TIẾP NHẬN HỒ SƠ"},{code:"2",active:!1,type:"dossier",title:"CHI TIẾT TIẾP NHẬN HỒ SƠ"},{code:"3",active:!1,type:"dossier",title:"TỔNG HỢP TRẢ KẾT QUẢ"},{code:"4",active:!1,type:"dossier",title:"CHI TIẾT TRẢ KẾT QUẢ"},{code:"5",active:!1,type:"thong_ke",title:"TỔNG HỢP HỒ SƠ DVC MỨC ĐỘ 3"},{code:"6",active:!1,type:"tai_chinh",title:"TỔNG HỢP PHÍ, LỆ PHÍ"},{code:"7",active:!1,type:"tai_chinh",title:"TỔNG HỢP PHÍ, LỆ PHÍ THEO TTHC"},{code:"8",active:!1,type:"dossier",title:"CHI TIẾT HỒ SƠ ĐÃ GIẢI QUYẾT"},{code:"9",active:!1,type:"dossier",title:"CHI TIẾT HỒ SƠ ĐANG XỬ LÝ"}],fakeReport:[{betimesCount:22,cancelledCount:10,deniedCount:50,domainCode:"YTE ",domainName:"Y Tế ",doneCount:40,govAgencyCode:"TPT",govAgencyName:"UBND Tỉnh Phú Thọ",interoperatingCount:0,month:1,onlineCount:30,ontimeCount:10,ontimePercentage:85,overdueCount:5,overtimeCount:5,overtimeInside:0,overtimeOutside:0,processCount:30,processingCount:0,receivedCount:40,releaseCount:10,releasingCount:11,remainingCount:10,reporting:!0,totalCount:100,undueCount:5,unresolvedCount:11,waitingCount:21,year:2018,onegateCount:12},{betimesCount:22,cancelledCount:11,deniedCount:51,domainCode:"YTE ",domainName:"Y Tế ",doneCount:41,govAgencyCode:"TPT2",govAgencyName:"UBND Tỉnh Phú Thọ 2",interoperatingCount:0,month:2,onlineCount:31,ontimeCount:15,ontimePercentage:80,overdueCount:5,overtimeCount:6,overtimeInside:0,overtimeOutside:0,processCount:31,processingCount:0,receivedCount:41,releaseCount:11,releasingCount:12,remainingCount:11,reporting:!0,totalCount:150,undueCount:5,unresolvedCount:15,waitingCount:12,year:2018,onegateCount:12}]}},185:function(n,e){},190:function(n,e,t){var o=t(126)(t(220),t(464),null,null);n.exports=o.exports},218:function(n,e,t){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var o=t(64),i=(t.n(o),t(63)),a=(t.n(i),t(65)),r=(t.n(a),t(32)),u=t.n(r),c=t(190),s=t.n(c),d=t(35),p=t(87),l=t.n(p),g=t(62),f=t(86),v=t(85);t.n(v);u.a.use(f.default),u.a.use(l.a),u.a.config.productionTip=!0,new u.a({el:"#app",router:d.a,store:g.a,render:function(n){return n(s.a)}})},220:function(n,e,t){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var o=t(35);e.default={data:function(){return{isCallBack:!0}},computed:{currentIndex:function(){return this.$store.getters.index}},created:function(){this.$nextTick(function(){})},updated:function(){var n=this;n.$nextTick(function(){var e=n.$router.history.current.params,t=n.$router.history.current.query;if(n.isCallBack){n.isCallBack=!1;var i=0;e.hasOwnProperty("index")&&(i=e.index),o.a.push({path:"/bao-cao/"+i,query:t})}})},watch:{$route:function(n,e){n.params,n.query}},methods:{toTableIndexing:function(n,e){this.$store.commit("setIndex",e),o.a.push({path:"/bao-cao/"+e,query:{renew:Math.floor(100*Math.random())+1,q:n.queryParams}})},filterSteps:function(n){}}}},35:function(n,e,t){"use strict";var o=t(136),i=t.n(o),a=t(32),r=t.n(a),u=t(188),c=[{path:"/bao-cao/:index",component:"Landing",props:!0},{path:"/report/bar/:year/:month/:agency/:domain",component:"LandingLinePublic",props:!0},{path:"/report/pie/:year/:month/:agency/:domain",component:"LandingPiePublic",props:!0},{path:"*",component:"NotFound"}],s=c.map(function(n){return i()({},n,{component:function(){return t(124)("./"+n.component+".vue")}})});r.a.use(u.a);var d=new u.a({routes:s});e.a=d},464:function(n,e){n.exports={render:function(){var n=this,e=n.$createElement,t=n._self._c||e;return t("v-app",[t("v-content",[t("router-view")],1)],1)},staticRenderFns:[]}},62:function(n,e,t){"use strict";t.d(e,"a",function(){return l});var o=t(135),i=t.n(o),a=t(32),r=t.n(a),u=t(189),c=t(129),s=t.n(c),d=t(125),p=t.n(d);r.a.use(u.a);var l=new u.a.Store({state:{initData:null,agencyGroups:null,loading:!1,index:0},actions:{loadInitResource:function(n){var e=n.commit,t=n.state;return null==t.initData?new i.a(function(n,t){var o={},i=window.location.href,a=window.location.href.lastIndexOf("#/");a>0&&(i=window.location.href.substr(0,a)),s.a.get(i+p.a.renderURLInit,o).then(function(t){var o=t.data;e("setInitData",o),n(o)}).catch(function(n){console.log(n),t(n)})}):new i.a(function(n,e){n(t.initData)})},getAgencyReportLists:function(n,e){var t=(n.commit,n.state);return new i.a(function(n,o){l.dispatch("loadInitResource").then(function(i){var a={headers:{groupId:t.initData.groupId,Accept:"application/json"},params:{year:e.year,month:e.month,group:e.group,reporting:!1,agency:e.agency}};e.report&&(a.params.domain="total"),"linemonth"===e.report&&(a.params.domain=""),s.a.get("/o/rest/statistics",a).then(function(e){var t=e.data;if(t.data){var o=t.data;n(o)}else n(null)}).catch(function(n){console.log(n),o(n)})})})},getAgencyGroups:function(n,e){var t=n.commit,o=n.state;return null==o.agencyGroups?new i.a(function(n,e){l.dispatch("loadInitResource").then(function(i){var a={headers:{groupId:o.initData.groupId}};s.a.get("/o/rest/v2/dictcollections/GOVERNMENT_AGENCY/dictgroups",a).then(function(e){var o=e.data;if(o.data){var i=o.data;t("setAgencyGroups",i),n(i)}else n(null)}).catch(function(n){console.log(n),e(n)})})}):new i.a(function(n,e){n(o.agencyGroups)})}},mutations:{setLoading:function(n,e){n.loading=e},setMenuConfigToDo:function(n,e){n.trangThaiHoSoList=e},setIndex:function(n,e){n.index=e},setInitData:function(n,e){n.initData=e},setAgencyGroups:function(n,e){n.agencyGroups=e}},getters:{loading:function(n){return n.loading},index:function(n){return n.index},loadingMenuConfigToDo:function(n){return p.a.trangThaiHoSoList}}})},63:function(n,e){},64:function(n,e){},65:function(n,e){}},[218]);
//# sourceMappingURL=app.93ce0cdc3a1393863307.js.map