package com.chenxiang.taxcalculator;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText editText1;
	private EditText editText2;
	private EditText editText3;
	private EditText editText4;
	private EditText editText5;

	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;

	private OnClickListener onClickListner1 = new OnClickListener() {

		public void onClick(View arg0) {
			double data1 = 0;
			double data2 = 0;
			double data3 = 0;
			double inputData = 0;
			double data4 = 0;
			double data5 = 0;

			try {
				data1 = Double.parseDouble(editText1.getText().toString());
			} catch (NumberFormatException nfe) {
				data1 = 0;
			}

			try {
				data2 = Double.parseDouble(editText2.getText().toString());
			} catch (NumberFormatException nfe) {
				data2 = 0;
			}

			try {
				data3 = Double.parseDouble(editText3.getText().toString());
			} catch (NumberFormatException nfe) {
				data3 = 0;
			}

			inputData = data1 - data2;

			if (inputData > data3) {
				double temp = inputData - data3;

				if (temp <= 1500) {
					data4 = temp * 0.03 - 0;
				} else if (temp <= 4500) {
					data4 = temp * 0.1 - 105;
				} else if (temp <= 9000) {
					data4 = temp * 0.2 - 555;
				} else if (temp <= 35000) {
					data4 = temp * 0.25 - 1005;
				} else if (temp <= 55000) {
					data4 = temp * 0.3 - 2755;
				} else if (temp <= 80000) {
					data4 = temp * 0.35 - 5505;
				} else {
					data4 = temp * 0.45 - 13505;
				}

				data5 = inputData - data4;
			} else {
				data4 = 0;
				data5 = inputData;
			}

			editText1.setTextColor(Color.BLACK);
			editText2.setTextColor(Color.BLACK);

			editText4.setText(Double.toString(data4));
			editText4.setTextColor(Color.RED);

			editText5.setText(Double.toString(data5));
			editText5.setTextColor(Color.RED);
		}

	};

	private OnClickListener onClickListner2 = new OnClickListener() {

		public void onClick(View arg0) {
			editText1.setText(null);
			editText1.setTextColor(Color.BLACK);

			editText2.setText(null);
			editText2.setTextColor(Color.BLACK);
		}

	};

	private OnClickListener onClickListner3 = new OnClickListener() {

		public void onClick(View arg0) {
			double data1 = 0;
			double data2 = 0;
			double data3 = 0;
			double data4 = 0;
			double data5 = 0;

			try {
				data2 = Double.parseDouble(editText2.getText().toString());
			} catch (NumberFormatException nfe) {
				data2 = 0;
			}

			try {
				data3 = Double.parseDouble(editText3.getText().toString());
			} catch (NumberFormatException nfe) {
				data3 = 0;
			}

			try {
				data4 = Double.parseDouble(editText4.getText().toString());
			} catch (NumberFormatException nfe) {
				data4 = 0;
			}

			try {
				data5 = Double.parseDouble(editText5.getText().toString());
			} catch (NumberFormatException nfe) {
				data5 = 0;
			}

			if (0 == data4) {
				if (data5 <= data3) {
					data1 = data2 + data5;
				} else {
					data5 = data3;
				}
			} else {
				double temp;

				if (data4 <= 45) {
					temp = data4 / 0.03;
				} else if (data4 <= 345) {
					temp = (data4 + 105) / 0.1;
				} else if (data4 <= 1245) {
					temp = (data4 + 555) / 0.2;
				} else if (data4 <= 7745) {
					temp = (data4 + 1005) / 0.25;
				} else if (data4 <= 13745) {
					temp = (data4 + 2755) / 0.3;
				} else if (data4 <= 22495) {
					temp = (data4 + 5505) / 0.35;
				} else {
					temp = (data4 + 13505) / 0.45;
				}

				data1 = data2 + data3 + temp;
				data5 = data3 + temp - data4;
			}

			editText2.setTextColor(Color.BLACK);
			editText4.setTextColor(Color.BLACK);

			editText1.setText(Double.toString(data1));
			editText1.setTextColor(Color.GREEN);

			editText5.setText(Double.toString(data5));
			editText5.setTextColor(Color.GREEN);
		}

	};

	private OnClickListener onClickListner4 = new OnClickListener() {

		public void onClick(View arg0) {
			editText4.setText(null);
			editText4.setTextColor(Color.BLACK);

			editText5.setText(null);
			editText5.setTextColor(Color.BLACK);
		}

	};

	private OnClickListener onClickListner5 = new OnClickListener() {

		public void onClick(View arg0) {
			double data1 = 0;
			double data2 = 0;
			double data3 = 0;
			double data4 = 0;
			double data5 = 0;

			try {
				data2 = Double.parseDouble(editText2.getText().toString());
			} catch (NumberFormatException nfe) {
				data2 = 0;
			}

			try {
				data3 = Double.parseDouble(editText3.getText().toString());
			} catch (NumberFormatException nfe) {
				data3 = 0;
			}

			try {
				data4 = Double.parseDouble(editText4.getText().toString());
			} catch (NumberFormatException nfe) {
				data4 = 0;
			}

			try {
				data5 = Double.parseDouble(editText5.getText().toString());
			} catch (NumberFormatException nfe) {
				data5 = 0;
			}

			if (data5 <= data3) {
				data1 = data2 + data5;
				data4 = 0;
			} else {
				double temp = data5 - data3;
				double x;

				if (temp <= (1500 - 45)) {
					x = (temp - 0) / (1 - 0.03);
					data4 = x * 0.03 - 0;
				} else if (temp <= (4500 - 345)) {
					x = (temp - 105) / (1 - 0.1);
					data4 = x * 0.1 - 105;
				} else if (temp <= (9000 - 1245)) {
					x = (temp - 555) / (1 - 0.2);
					data4 = x * 0.2 - 555;
				} else if (temp <= (35000 - 7745)) {
					x = (temp - 1005) / (1 - 0.25);
					data4 = x * 0.25 - 1005;
				} else if (temp <= (55000 - 13745)) {
					x = (temp - 2755) / (1 - 0.3);
					data4 = x * 0.3 - 2755;
				} else if (temp <= (80000 - 22495)) {
					x = (temp - 5505) / (1 - 0.35);
					data4 = x * 0.35 - 5505;
				} else {
					x = (temp - 13505) / (1 - 0.45);
					data4 = x * 0.45 - 13505;
				}

				data1 = data2 + data4 + data5;
			}

			editText2.setTextColor(Color.BLACK);
			editText5.setTextColor(Color.BLACK);

			editText1.setText(Double.toString(data1));
			editText1.setTextColor(Color.BLUE);

			editText4.setText(Double.toString(data4));
			editText4.setTextColor(Color.BLUE);
		}

	};

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		editText1 = (EditText) findViewById(R.id.editText1);
		editText2 = (EditText) findViewById(R.id.editText2);
		editText3 = (EditText) findViewById(R.id.editText3);
		editText4 = (EditText) findViewById(R.id.editText4);
		editText5 = (EditText) findViewById(R.id.editText5);

		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);

		button1.setOnClickListener(onClickListner1);
		button2.setOnClickListener(onClickListner2);
		button3.setOnClickListener(onClickListner3);
		button4.setOnClickListener(onClickListner4);
		button5.setOnClickListener(onClickListner5);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);

		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		boolean flag = false;

		switch (item.getItemId()) {
		case R.id.menu_settings: {
			// to do
		}
			break;

		case R.id.menu_about: {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, AboutActivity.class);

			startActivity(intent);

			flag = true;
		}
			break;
		}

		if (flag) {
			return true;
		} else {
			return super.onOptionsItemSelected(item);
		}
	}

}
