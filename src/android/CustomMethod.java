package cordova.plugin.sreesampleplugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.content.pm.PackageManager;
import android.Manifest;
import android.os.Build;

import org.apache.cordova.CordovaArgs;
import org.apache.cordova.PermissionHelper;
import org.apache.cordova.PluginResult;
import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONException;

import javax.security.auth.callback.Callback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class CustomMethod extends CordovaPlugin {
    public String GetAdditionInfo() {
        return "Accessed";
    }
}