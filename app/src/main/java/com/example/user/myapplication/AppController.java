package com.example.user.myapplication;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

public class AppController extends Application {

    public static final boolean ENCRYPTED = true;
    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();


      DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this,"grocery-db"); //The users-db here is the name of our database.
     Database db = helper.getWritableDb();
      daoSession = new DaoMaster(db).newSession();
   }

  public DaoSession getDaoSession() {
  return daoSession;
   }

}
