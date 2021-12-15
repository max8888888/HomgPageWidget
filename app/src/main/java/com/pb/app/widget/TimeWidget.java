package com.pb.app.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;

/**
 * Implementation of App Widget functionality.
 */
public class TimeWidget extends AppWidgetProvider {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("xmg", "TimeWidget  onReceive  action="+intent.getAction());
        super.onReceive(context, intent);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        Log.i("xmg", "TimeWidget  onUpdate");
    }

    @Override
    public void onEnabled(Context context) {
        Log.i("xmg", "TimeWidget  onEnabled");
        context.startService(new Intent(context, TimeService.class));//开启服务
    }


    @Override
    public void onDisabled(Context context) {
        Log.i("xmg", "TimeWidget  onDisabled");
        context.stopService(new Intent(context, TimeService.class));//stop服务
    }
}