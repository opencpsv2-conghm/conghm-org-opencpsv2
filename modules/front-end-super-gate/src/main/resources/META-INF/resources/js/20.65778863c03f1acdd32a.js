webpackJsonp([20],{247:function(t,e,n){var a=n(146)(n(721),n(729),null,null);t.exports=a.exports},721:function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.default={props:{payments:{type:Object,default:function(){}},payment_type:{type:Number,default:function(){return 5}}},data:function(){return{dossierId:"",loadingAction:!1,feeAmount:"",checkPaid:!1}},computed:{loading:function(){return this.$store.getters.loading},loadingTable:function(){return this.$store.getters.loadingTable}},created:function(){this.$nextTick(function(){})},methods:{initData:function(t){var e=this;e.dossierId=t,e.$store.dispatch("getDetailDossier",t).then(function(t){e.$store.dispatch("loadDossierPayments",t).then(function(t){e.feeAmount=t.feeAmount}).catch(function(t){console.log(t)})}).catch(function(t){console.log(t)})},currency:function(t){if(t){return(t/1).toFixed(0).replace(".",",").toString().replace(/\B(?=(\d{3})+(?!\d))/g,".")}return""}}}},729:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("v-expansion-panel",{staticClass:"expansion-pl"},[n("v-expansion-panel-content",{attrs:{"hide-actions":"",value:"1"}},[n("div",{attrs:{slot:"header"},slot:"header"},[n("div",{staticClass:"background-triangle-small"},[n("v-icon",{attrs:{size:"18",color:"white"}},[t._v("star_rate")])],1),t._v("XÁC NHẬN THU PHÍ\n    ")]),t._v(" "),n("v-card",[n("v-card-text",[5===t.payment_type?n("div",{staticClass:"pl-3 fee-info"},[n("v-checkbox",{attrs:{label:"Phí phải nộp: "+t.currency(t.payments.feeAmount)+" VNĐ"},model:{value:t.checkPaid,callback:function(e){t.checkPaid=e},expression:"checkPaid"}}),t._v(" "),n("span",{staticClass:"red--text"},[t._v("* ")]),t._v(" Đánh dấu để xác định người làm thủ tục đã hoàn thành nộp phí.\n        ")],1):t._e()])],1)],1)],1)},staticRenderFns:[]}}});
//# sourceMappingURL=20.65778863c03f1acdd32a.js.map