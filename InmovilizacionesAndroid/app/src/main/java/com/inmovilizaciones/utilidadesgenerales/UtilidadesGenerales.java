package com.inmovilizaciones.utilidadesgenerales;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.MimeTypeMap;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static android.content.Context.INPUT_METHOD_SERVICE;

/**
 * Created by VICTORAL on 16/12/2016.
 */

public class UtilidadesGenerales {
    public static Context context;
    public static int STRING_TYPE = 0;
    public static int INT_TYPE = 1;
    public static int BOOLEAN_TYPE = 2;
    public static int LONG_TYPE = 3;
    public static int DOUBLE_TYPE = 4;

    public static void mostrarMensaje(final String mensaje) throws Exception {
        if (context == null) throw new Exception("No se ha establecido el contexto");
        Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
    }

    public static void mostrarMensaje(final String mensaje, int length) throws Exception {
        if (context == null) throw new Exception("No se ha establecido el contexto");
        Toast.makeText(context, mensaje, length).show();
    }

    public static boolean isOnline() throws Exception {
        if (context == null) throw new Exception("No se ha establecido el contexto");
        try {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo netInfo = cm.getActiveNetworkInfo();
            return netInfo != null && netInfo.isConnectedOrConnecting();
        } catch (Exception t) {
            return false;
        }
    }

    public static String getMimeType(String url) {
        String extension = MimeTypeMap.getFileExtensionFromUrl(url);
        if (extension != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension);
        }
        return null;
    }

    public static String getIMEI() throws Exception {
        if (context == null) throw new Exception("No se ha establecido el contexto");
        String result = "";
        try {
            TelephonyManager tmanager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            result = tmanager.getDeviceId();
            if (result.equals(null))
                throw new Exception();

        } catch (Exception exp) {
            result = "Dispositivo no compatible";
        }
        return result;
    }

    public static void mostrarDialogo(String mensaje) throws Exception {
        if (context == null) throw new Exception("No se ha establecido el contexto");
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(mensaje).setCancelable(false).setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public static void hideSoftKeyboard(View view) throws Exception {
        if (context == null) throw new Exception("No se ha establecido el contexto");
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void showSoftKeyboard(View view) throws Exception {
        if (context == null) throw new Exception("No se ha establecido el contexto");
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(INPUT_METHOD_SERVICE);
        view.requestFocus();
        inputMethodManager.showSoftInput(view, 0);
    }

    public static Object leerSharedPreferences(int keyValue, int defaultValue, int tipoSharedPreference) throws Exception {
        if (context == null) {
            throw new Exception("No se ha establecido el contexto");
        }
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (tipoSharedPreference == STRING_TYPE) {
            return sharedPreferences.getString(context.getString(keyValue), context.getResources().getString(defaultValue));
        }
        if (tipoSharedPreference == INT_TYPE) {
            return Integer.valueOf(sharedPreferences.getInt(context.getString(keyValue), context.getResources().getInteger(defaultValue)));
        }
        if (tipoSharedPreference == BOOLEAN_TYPE) {
            return Boolean.valueOf(sharedPreferences.getBoolean(context.getString(keyValue), context.getResources().getBoolean(defaultValue)));
        }
        return null;
    }

    public static boolean escribirSharedPreferences(int keyValue, Object value, int tipoSharedPreference) throws Exception {
        if (context == null) {
            throw new Exception("No se ha establecido el contexto");
        } else if (value == null) {
            return false;
        } else {
            SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
            if (tipoSharedPreference == STRING_TYPE) {
                editor.putString(context.getString(keyValue), (String) value);
            } else if (tipoSharedPreference == INT_TYPE) {
                editor.putInt(context.getString(keyValue), ((Integer) value).intValue());
            } else if (tipoSharedPreference == BOOLEAN_TYPE) {
                editor.putBoolean(context.getString(keyValue), ((Boolean) value).booleanValue());
            } else if (tipoSharedPreference == DOUBLE_TYPE) {
                editor.putLong(context.getString(keyValue), ((Long) value).longValue());
            }
            return editor.commit();
        }
    }


    public byte[] convertirbytes(File archivo) {

        File file = archivo;
        FileInputStream fileInputStream = null;
        byte[] b = null;
        try {

            b = new byte[(int) file.length()];
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            b = null;
        } catch (IOException e1) {
            e1.printStackTrace();
            b = null;
        } catch (Exception exp) {
            exp.printStackTrace();
        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return b;
    }

}
