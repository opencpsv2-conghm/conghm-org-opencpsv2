<!-- TODO paymentViewJX template one page view List detail template -->
<div id="activity_expand_list_template" class="hidden">
	<template slot="items" slot-scope="props">
		<td style="padding-top: 8px;"> <v-checkbox primary hide-details v-model="props.selected" ></v-checkbox> </td>
		<td style="padding-top: 15px;">{{ props.index + 1 }}</td>
		<td style="padding-top: 15px;" class="text-xs-left">{{ props.item.dossierNo }}</td>
		<td style="padding-top: 15px;" class="text-xs-center">{{ props.item.createDate | date }}</td>
		<td style="padding-top: 15px;" class="text-xs-right red--text">{{ props.item.paymentAmount | money }} VNĐ</td>
		<td style="padding-top: 15px;" class="text-xs-left">{{ props.item.applicantName }}</td>
		<td style="padding-top: 5px;" class="text-xs-right"><v-btn v-on:click.native="toPaymentDetail(props.index)" flat class="mx-0 my-0" color="grey darken-1">Chi tiết <v-icon>forward</v-icon></v-btn></td>
	</template>
</div>