import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
WifiInfo wifiInfo = wifiManager.getConnectionInfo();
String macAddress = wifiInfo.getMacAddress();
