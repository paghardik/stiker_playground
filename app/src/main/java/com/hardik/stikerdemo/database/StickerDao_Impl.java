package com.hardik.stikerdemo.database;

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
import java.lang.Exception;
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
public final class StickerDao_Impl extends StickerDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<StickerEntity> __insertionAdapterOfStickerEntity;

  private final EntityDeletionOrUpdateAdapter<StickerEntity> __deletionAdapterOfStickerEntity;

  public StickerDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStickerEntity = new EntityInsertionAdapter<StickerEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `StickerEntity` (`id`,`categoryId`,`packIdentifier`,`imageFileName`,`emojis`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StickerEntity value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getCategoryId());
        if (value.getPackIdentifier() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPackIdentifier());
        }
        if (value.getImageFileName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImageFileName());
        }
        if (value.getEmojis() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getEmojis());
        }
      }
    };
    this.__deletionAdapterOfStickerEntity = new EntityDeletionOrUpdateAdapter<StickerEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `StickerEntity` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StickerEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object insert(final StickerEntity[] obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStickerEntity.insert(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final StickerEntity obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStickerEntity.insert(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertAll(final List<? extends StickerEntity> listObj,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStickerEntity.insert(listObj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final StickerEntity obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfStickerEntity.handle(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getStickerByIdentifier(final String packIdentifier,
      final Continuation<? super List<StickerEntity>> p1) {
    final String _sql = "SELECT * FROM StickerEntity WHERE packIdentifier = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (packIdentifier == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, packIdentifier);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<List<StickerEntity>>() {
      @Override
      public List<StickerEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfPackIdentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "packIdentifier");
          final int _cursorIndexOfImageFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "imageFileName");
          final int _cursorIndexOfEmojis = CursorUtil.getColumnIndexOrThrow(_cursor, "emojis");
          final List<StickerEntity> _result = new ArrayList<StickerEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StickerEntity _item;
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpPackIdentifier;
            _tmpPackIdentifier = _cursor.getString(_cursorIndexOfPackIdentifier);
            final String _tmpImageFileName;
            _tmpImageFileName = _cursor.getString(_cursorIndexOfImageFileName);
            final String _tmpEmojis;
            _tmpEmojis = _cursor.getString(_cursorIndexOfEmojis);
            _item = new StickerEntity(_tmpCategoryId,_tmpPackIdentifier,_tmpImageFileName,_tmpEmojis);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public List<StickerEntity> getStickerByIdentifierOneShot(final String packIdentifier) {
    final String _sql = "SELECT * FROM StickerEntity WHERE packIdentifier = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (packIdentifier == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, packIdentifier);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
      final int _cursorIndexOfPackIdentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "packIdentifier");
      final int _cursorIndexOfImageFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "imageFileName");
      final int _cursorIndexOfEmojis = CursorUtil.getColumnIndexOrThrow(_cursor, "emojis");
      final List<StickerEntity> _result = new ArrayList<StickerEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final StickerEntity _item;
        final int _tmpCategoryId;
        _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
        final String _tmpPackIdentifier;
        _tmpPackIdentifier = _cursor.getString(_cursorIndexOfPackIdentifier);
        final String _tmpImageFileName;
        _tmpImageFileName = _cursor.getString(_cursorIndexOfImageFileName);
        final String _tmpEmojis;
        _tmpEmojis = _cursor.getString(_cursorIndexOfEmojis);
        _item = new StickerEntity(_tmpCategoryId,_tmpPackIdentifier,_tmpImageFileName,_tmpEmojis);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<StickerEntity>> getStickerByIdentifierLiveData(final String packIdentifier) {
    final String _sql = "SELECT * FROM StickerEntity WHERE packIdentifier = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (packIdentifier == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, packIdentifier);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"StickerEntity"}, false, new Callable<List<StickerEntity>>() {
      @Override
      public List<StickerEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfPackIdentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "packIdentifier");
          final int _cursorIndexOfImageFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "imageFileName");
          final int _cursorIndexOfEmojis = CursorUtil.getColumnIndexOrThrow(_cursor, "emojis");
          final List<StickerEntity> _result = new ArrayList<StickerEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StickerEntity _item;
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpPackIdentifier;
            _tmpPackIdentifier = _cursor.getString(_cursorIndexOfPackIdentifier);
            final String _tmpImageFileName;
            _tmpImageFileName = _cursor.getString(_cursorIndexOfImageFileName);
            final String _tmpEmojis;
            _tmpEmojis = _cursor.getString(_cursorIndexOfEmojis);
            _item = new StickerEntity(_tmpCategoryId,_tmpPackIdentifier,_tmpImageFileName,_tmpEmojis);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
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
