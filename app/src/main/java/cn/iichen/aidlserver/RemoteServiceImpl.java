package cn.iichen.aidlserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import androidx.annotation.Nullable;

public class RemoteServiceImpl extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return iRemoteService;
    }

    IRemoteService.Stub iRemoteService = new IRemoteService.Stub() {
        @Override
        public int plus(int a, int b) throws RemoteException {
            return a + b;
        }
    };

    // 或者定义类的形式
    public static class RemoteServiceBinder extends IRemoteService.Stub {
        @Override
        public int plus(int a, int b) throws RemoteException {
            return a + b;
        }
    }








}
