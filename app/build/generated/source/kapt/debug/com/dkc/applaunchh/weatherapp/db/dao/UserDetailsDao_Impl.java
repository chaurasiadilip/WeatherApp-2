package com.dkc.applaunchh.weatherapp.db.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDetailsDao_Impl implements UserDetailsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserDetailEntity> __insertionAdapterOfUserDetailEntity;

  private final EntityDeletionOrUpdateAdapter<UserDetailEntity> __deletionAdapterOfUserDetailEntity;

  public UserDetailsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserDetailEntity = new EntityInsertionAdapter<UserDetailEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `UserDetails` (`firstname`,`lastname`,`email`,`profilepic`,`id`) VALUES (?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserDetailEntity value) {
        if (value.getFirstname() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getFirstname());
        }
        if (value.getLastname() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getLastname());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getProfilepic() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getProfilepic());
        }
        stmt.bindLong(5, value.getId());
      }
    };
    this.__deletionAdapterOfUserDetailEntity = new EntityDeletionOrUpdateAdapter<UserDetailEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `UserDetails` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserDetailEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object insert(final UserDetailEntity userEntityEntity,
      final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfUserDetailEntity.insertAndReturnId(userEntityEntity);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final UserDetailEntity userDetailEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfUserDetailEntity.handle(userDetailEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<UserDetailEntity>> getAllUserDetails() {
    final String _sql = "SELECT * FROM UserDetails";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"UserDetails"}, false, new Callable<List<UserDetailEntity>>() {
      @Override
      public List<UserDetailEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFirstname = CursorUtil.getColumnIndexOrThrow(_cursor, "firstname");
          final int _cursorIndexOfLastname = CursorUtil.getColumnIndexOrThrow(_cursor, "lastname");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfProfilepic = CursorUtil.getColumnIndexOrThrow(_cursor, "profilepic");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<UserDetailEntity> _result = new ArrayList<UserDetailEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UserDetailEntity _item;
            final String _tmpFirstname;
            _tmpFirstname = _cursor.getString(_cursorIndexOfFirstname);
            final String _tmpLastname;
            _tmpLastname = _cursor.getString(_cursorIndexOfLastname);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpProfilepic;
            _tmpProfilepic = _cursor.getString(_cursorIndexOfProfilepic);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item = new UserDetailEntity(_tmpFirstname,_tmpLastname,_tmpEmail,_tmpProfilepic,_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
