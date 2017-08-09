/**
 * 
 */
package com.atar.activitys;

import com.atar.net.NetWorkInterfaces;

import android.os.Bundle;
import android.view.View;

/**
 *****************************************************************************************************************************************************************************
 * 
 * @author :Atar
 * @createTime:2017-8-9下午4:04:04
 * @version:1.0.0
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 *****************************************************************************************************************************************************************************
 */
public class MainDemoActivity extends AtarCommonActivity {
	@Override
	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		addContentView(R.layout.activity_maindemo);
	}

	@Override
	protected void bindEvent() {
		findViewById(R.id.btn_net_test).setOnClickListener(this);
	}

	@Override
	protected void initValue() {
		super.initValue();
		setActivityTitle("demo主界面");
	}

	@Override
	public void onClick(View v) {
		super.onClick(v);
		switch (v.getId()) {
		case R.id.btn_net_test:
			NetWorkInterfaces.GetWonderTopicList(this, this, "1");
			break;
		}
	}
}
