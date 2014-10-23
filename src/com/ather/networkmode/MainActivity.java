package com.ather.networkmode;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.telephony.TelephonyManager;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	private Context context;	
	private TelephonyManager tm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
       
        context = getApplicationContext();
     //Display Toast
     		tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
     		String type = "Network type is unknown";
     		if (tm.getNetworkType() == TelephonyManager.NETWORK_TYPE_1xRTT)type = "Current network is 1xRTT";
     		if (tm.getNetworkType() == TelephonyManager.NETWORK_TYPE_CDMA)type = "Current network is CDMA";
     		if (tm.getNetworkType() == TelephonyManager.NETWORK_TYPE_EDGE)type = "Current network is EDGE";
     		if (tm.getNetworkType() == TelephonyManager.NETWORK_TYPE_EHRPD)type = "Current network is eHRPD";
     		if (tm.getNetworkType() == TelephonyManager.NETWORK_TYPE_EVDO_0)type = "Current network is EVDO revision 0";
     		if (tm.getNetworkType() == TelephonyManager.NETWORK_TYPE_EVDO_A)type = "Current network is EVDO revision A";
     		if (tm.getNetworkType() == TelephonyManager.NETWORK_TYPE_EVDO_B)type = "Current network is EVDO revision B";
     		if (tm.getNetworkType() == TelephonyManager.NETWORK_TYPE_GPRS)type = "Current network is GPRS";
     		if (tm.getNetworkType() == TelephonyManager.NETWORK_TYPE_HSDPA)type = "Current network is HSDPA";
     		if (tm.getNetworkType() == TelephonyManager.NETWORK_TYPE_HSPA)type = "Current network is HSPA";
     		if (tm.getNetworkType() == TelephonyManager.NETWORK_TYPE_HSPAP)type = "Current network is HSPA+";
     		if (tm.getNetworkType() == TelephonyManager.NETWORK_TYPE_HSUPA)type = "Current network is HSUPA";
     		if (tm.getNetworkType() == TelephonyManager.NETWORK_TYPE_IDEN)type = "Current network is iDen";
     		if (tm.getNetworkType() == TelephonyManager.NETWORK_TYPE_LTE)type = "Current network is LTE";
     		if (tm.getNetworkType() == TelephonyManager.NETWORK_TYPE_UMTS)type = "Current network is UMTS";
     		
     		Toast.makeText(context, type, Toast.LENGTH_LONG).show();

     		// Launch Activity RadioInfo
     		Intent i = new Intent();
     		i.setClassName( "com.android.settings", "com.android.settings.RadioInfo" );
     		startActivity(i);
     		
     		// Close this Activity
     		finish();
        
        
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
