package com.example.testezure55
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

import io.flutter.embedding.android.FlutterActivity

AppCenter.start(getApplication(), "{123456}",
Analytics.class, Crashes.class);

class MainActivity: FlutterActivity() {
}
