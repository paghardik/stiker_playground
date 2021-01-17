package com.hardik.stikerdemo.database;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CategoryDao_Impl extends CategoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<StickerCategoryEntity> __insertionAdapterOfStickerCategoryEntity;

  private final EntityDeletionOrUpdateAdapter<StickerCategoryEntity> __deletionAdapterOfStickerCategoryEntity;

  public CategoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStickerCategoryEntity = new EntityInsertionAdapter<StickerCategoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `StickerCategoryEntity` (`id`,`searchTerm`,`title`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StickerCategoryEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getSearchTerm() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSearchTerm());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
      }
    };
    this.__deletionAdapterOfStickerCategoryEntity = new EntityDeletionOrUpdateAdapter<StickerCategoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `StickerCategoryEntity` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StickerCategoryEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object insert(final StickerCategoryEntity[] obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStickerCategoryEntity.insert(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final StickerCategoryEntity obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStickerCategoryEntity.insert(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertAll(final List<? extends StickerCategoryEntity> listObj,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStickerCategoryEntity.insert(listObj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final StickerCategoryEntity obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfStickerCategoryEntity.handle(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getCategory(final Continuation<? super List<StickerCategoryEntity>> p0) {
    final String _sql = "SELECT * FROM StickerCategoryEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<StickerCategoryEntity>>() {
      @Override
      public List<StickerCategoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSearchTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "searchTerm");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final List<StickerCategoryEntity> _result = new ArrayList<StickerCategoryEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StickerCategoryEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpSearchTerm;
            _tmpSearchTerm = _cursor.getString(_cursorIndexOfSearchTerm);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _item = new StickerCategoryEntity(_tmpId,_tmpSearchTerm,_tmpTitle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public LiveData<List<StickerCategoryEntity>> getCategoryLiveData() {
    final String _sql = "SELECT * FROM StickerCategoryEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"StickerCategoryEntity"}, false, new Callable<List<StickerCategoryEntity>>() {
      @Override
      public List<StickerCategoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSearchTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "searchTerm");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final List<StickerCategoryEntity> _result = new ArrayList<StickerCategoryEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StickerCategoryEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpSearchTerm;
            _tmpSearchTerm = _cursor.getString(_cursorIndexOfSearchTerm);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _item = new StickerCategoryEntity(_tmpId,_tmpSearchTerm,_tmpTitle);
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

  @Override
  public Object getCategoryAndPack(final Continuation<? super List<StickerCategorieAndPack>> p0) {
    final String _sql = "SELECT * FROM StickerCategoryEntity WHERE id IN (SELECT DISTINCT(categoryId) FROM StickerPackEntity)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, true, new Callable<List<StickerCategorieAndPack>>() {
      @Override
      public List<StickerCategorieAndPack> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfSearchTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "searchTerm");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final LongSparseArray<ArrayList<StickerPackEntity>> _collectionStickerPackEntity = new LongSparseArray<ArrayList<StickerPackEntity>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
              ArrayList<StickerPackEntity> _tmpStickerPackEntityCollection = _collectionStickerPackEntity.get(_tmpKey);
              if (_tmpStickerPackEntityCollection == null) {
                _tmpStickerPackEntityCollection = new ArrayList<StickerPackEntity>();
                _collectionStickerPackEntity.put(_tmpKey, _tmpStickerPackEntityCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipStickerPackEntityAscomDuckinfotechStikerdemoDatabaseStickerPackEntity(_collectionStickerPackEntity);
            final List<StickerCategorieAndPack> _result = new ArrayList<StickerCategorieAndPack>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final StickerCategorieAndPack _item;
              final StickerCategoryEntity _tmpStickerCategoryEntity;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfSearchTerm) && _cursor.isNull(_cursorIndexOfTitle))) {
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                final String _tmpSearchTerm;
                _tmpSearchTerm = _cursor.getString(_cursorIndexOfSearchTerm);
                final String _tmpTitle;
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
                _tmpStickerCategoryEntity = new StickerCategoryEntity(_tmpId,_tmpSearchTerm,_tmpTitle);
              }  else  {
                _tmpStickerCategoryEntity = null;
              }
              ArrayList<StickerPackEntity> _tmpStickerPackEntityCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpStickerPackEntityCollection_1 = _collectionStickerPackEntity.get(_tmpKey_1);
              if (_tmpStickerPackEntityCollection_1 == null) {
                _tmpStickerPackEntityCollection_1 = new ArrayList<StickerPackEntity>();
              }
              _item = new StickerCategorieAndPack(_tmpStickerCategoryEntity,_tmpStickerPackEntityCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, p0);
  }

  @Override
  public LiveData<List<StickerCategorieAndPack>> getCategoryAndPackLiveData() {
    final String _sql = "SELECT * FROM StickerCategoryEntity WHERE id IN (SELECT DISTINCT(categoryId) FROM StickerPackEntity)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"StickerPackEntity","StickerCategoryEntity"}, true, new Callable<List<StickerCategorieAndPack>>() {
      @Override
      public List<StickerCategorieAndPack> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfSearchTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "searchTerm");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final LongSparseArray<ArrayList<StickerPackEntity>> _collectionStickerPackEntity = new LongSparseArray<ArrayList<StickerPackEntity>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
              ArrayList<StickerPackEntity> _tmpStickerPackEntityCollection = _collectionStickerPackEntity.get(_tmpKey);
              if (_tmpStickerPackEntityCollection == null) {
                _tmpStickerPackEntityCollection = new ArrayList<StickerPackEntity>();
                _collectionStickerPackEntity.put(_tmpKey, _tmpStickerPackEntityCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipStickerPackEntityAscomDuckinfotechStikerdemoDatabaseStickerPackEntity(_collectionStickerPackEntity);
            final List<StickerCategorieAndPack> _result = new ArrayList<StickerCategorieAndPack>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final StickerCategorieAndPack _item;
              final StickerCategoryEntity _tmpStickerCategoryEntity;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfSearchTerm) && _cursor.isNull(_cursorIndexOfTitle))) {
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                final String _tmpSearchTerm;
                _tmpSearchTerm = _cursor.getString(_cursorIndexOfSearchTerm);
                final String _tmpTitle;
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
                _tmpStickerCategoryEntity = new StickerCategoryEntity(_tmpId,_tmpSearchTerm,_tmpTitle);
              }  else  {
                _tmpStickerCategoryEntity = null;
              }
              ArrayList<StickerPackEntity> _tmpStickerPackEntityCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpStickerPackEntityCollection_1 = _collectionStickerPackEntity.get(_tmpKey_1);
              if (_tmpStickerPackEntityCollection_1 == null) {
                _tmpStickerPackEntityCollection_1 = new ArrayList<StickerPackEntity>();
              }
              _item = new StickerCategorieAndPack(_tmpStickerCategoryEntity,_tmpStickerPackEntityCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getCategoryAndPackById(final int catId,
      final Continuation<? super StickerCategorieAndPack> p1) {
    final String _sql = "SELECT * FROM StickerCategoryEntity WHERE id = ? IN (SELECT DISTINCT(categoryId) FROM StickerPackEntity)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, catId);
    return CoroutinesRoom.execute(__db, true, new Callable<StickerCategorieAndPack>() {
      @Override
      public StickerCategorieAndPack call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfSearchTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "searchTerm");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final LongSparseArray<ArrayList<StickerPackEntity>> _collectionStickerPackEntity = new LongSparseArray<ArrayList<StickerPackEntity>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
              ArrayList<StickerPackEntity> _tmpStickerPackEntityCollection = _collectionStickerPackEntity.get(_tmpKey);
              if (_tmpStickerPackEntityCollection == null) {
                _tmpStickerPackEntityCollection = new ArrayList<StickerPackEntity>();
                _collectionStickerPackEntity.put(_tmpKey, _tmpStickerPackEntityCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipStickerPackEntityAscomDuckinfotechStikerdemoDatabaseStickerPackEntity(_collectionStickerPackEntity);
            final StickerCategorieAndPack _result;
            if(_cursor.moveToFirst()) {
              final StickerCategoryEntity _tmpStickerCategoryEntity;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfSearchTerm) && _cursor.isNull(_cursorIndexOfTitle))) {
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                final String _tmpSearchTerm;
                _tmpSearchTerm = _cursor.getString(_cursorIndexOfSearchTerm);
                final String _tmpTitle;
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
                _tmpStickerCategoryEntity = new StickerCategoryEntity(_tmpId,_tmpSearchTerm,_tmpTitle);
              }  else  {
                _tmpStickerCategoryEntity = null;
              }
              ArrayList<StickerPackEntity> _tmpStickerPackEntityCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpStickerPackEntityCollection_1 = _collectionStickerPackEntity.get(_tmpKey_1);
              if (_tmpStickerPackEntityCollection_1 == null) {
                _tmpStickerPackEntityCollection_1 = new ArrayList<StickerPackEntity>();
              }
              _result = new StickerCategorieAndPack(_tmpStickerCategoryEntity,_tmpStickerPackEntityCollection_1);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getCategoryById(final int catId,
      final Continuation<? super StickerCategoryEntity> p1) {
    final String _sql = "SELECT * FROM StickerCategoryEntity WHERE id == ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, catId);
    return CoroutinesRoom.execute(__db, false, new Callable<StickerCategoryEntity>() {
      @Override
      public StickerCategoryEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSearchTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "searchTerm");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final StickerCategoryEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpSearchTerm;
            _tmpSearchTerm = _cursor.getString(_cursorIndexOfSearchTerm);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _result = new StickerCategoryEntity(_tmpId,_tmpSearchTerm,_tmpTitle);
          } else {
            _result = null;
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
  public Flow<List<StickerCategoryEntity>> getCategoryFlow() {
    final String _sql = "SELECT * FROM StickerCategoryEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"StickerCategoryEntity"}, new Callable<List<StickerCategoryEntity>>() {
      @Override
      public List<StickerCategoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSearchTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "searchTerm");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final List<StickerCategoryEntity> _result = new ArrayList<StickerCategoryEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StickerCategoryEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpSearchTerm;
            _tmpSearchTerm = _cursor.getString(_cursorIndexOfSearchTerm);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _item = new StickerCategoryEntity(_tmpId,_tmpSearchTerm,_tmpTitle);
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

  @Override
  public Flow<List<StickerCategorieAndPack>> getCategoryAndPackFlow() {
    final String _sql = "SELECT * FROM StickerCategoryEntity WHERE id IN (SELECT DISTINCT(categoryId) FROM StickerPackEntity)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[]{"StickerPackEntity","StickerCategoryEntity"}, new Callable<List<StickerCategorieAndPack>>() {
      @Override
      public List<StickerCategorieAndPack> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfSearchTerm = CursorUtil.getColumnIndexOrThrow(_cursor, "searchTerm");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final LongSparseArray<ArrayList<StickerPackEntity>> _collectionStickerPackEntity = new LongSparseArray<ArrayList<StickerPackEntity>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
              ArrayList<StickerPackEntity> _tmpStickerPackEntityCollection = _collectionStickerPackEntity.get(_tmpKey);
              if (_tmpStickerPackEntityCollection == null) {
                _tmpStickerPackEntityCollection = new ArrayList<StickerPackEntity>();
                _collectionStickerPackEntity.put(_tmpKey, _tmpStickerPackEntityCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipStickerPackEntityAscomDuckinfotechStikerdemoDatabaseStickerPackEntity(_collectionStickerPackEntity);
            final List<StickerCategorieAndPack> _result = new ArrayList<StickerCategorieAndPack>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final StickerCategorieAndPack _item;
              final StickerCategoryEntity _tmpStickerCategoryEntity;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfSearchTerm) && _cursor.isNull(_cursorIndexOfTitle))) {
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                final String _tmpSearchTerm;
                _tmpSearchTerm = _cursor.getString(_cursorIndexOfSearchTerm);
                final String _tmpTitle;
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
                _tmpStickerCategoryEntity = new StickerCategoryEntity(_tmpId,_tmpSearchTerm,_tmpTitle);
              }  else  {
                _tmpStickerCategoryEntity = null;
              }
              ArrayList<StickerPackEntity> _tmpStickerPackEntityCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpStickerPackEntityCollection_1 = _collectionStickerPackEntity.get(_tmpKey_1);
              if (_tmpStickerPackEntityCollection_1 == null) {
                _tmpStickerPackEntityCollection_1 = new ArrayList<StickerPackEntity>();
              }
              _item = new StickerCategorieAndPack(_tmpStickerCategoryEntity,_tmpStickerPackEntityCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  private void __fetchRelationshipStickerPackEntityAscomDuckinfotechStikerdemoDatabaseStickerPackEntity(
      final LongSparseArray<ArrayList<StickerPackEntity>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<StickerPackEntity>> _tmpInnerMap = new LongSparseArray<ArrayList<StickerPackEntity>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipStickerPackEntityAscomDuckinfotechStikerdemoDatabaseStickerPackEntity(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<StickerPackEntity>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipStickerPackEntityAscomDuckinfotechStikerdemoDatabaseStickerPackEntity(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `identifier`,`categoryId`,`name`,`publisher`,`trayImageFile`,`publisherEmail`,`publisherWebsite`,`privacyPolicyWebsite`,`licenseAgreementWebsite`,`imageDataVersion`,`avoidCache`,`stickersCount`,`previewImages`,`packUrl`,`downloadSize`,`isPremium` FROM `StickerPackEntity` WHERE `categoryId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "categoryId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfIdentifier = CursorUtil.getColumnIndex(_cursor, "identifier");
      final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndex(_cursor, "categoryId");
      final int _cursorIndexOfName = CursorUtil.getColumnIndex(_cursor, "name");
      final int _cursorIndexOfPublisher = CursorUtil.getColumnIndex(_cursor, "publisher");
      final int _cursorIndexOfTrayImageFile = CursorUtil.getColumnIndex(_cursor, "trayImageFile");
      final int _cursorIndexOfPublisherEmail = CursorUtil.getColumnIndex(_cursor, "publisherEmail");
      final int _cursorIndexOfPublisherWebsite = CursorUtil.getColumnIndex(_cursor, "publisherWebsite");
      final int _cursorIndexOfPrivacyPolicyWebsite = CursorUtil.getColumnIndex(_cursor, "privacyPolicyWebsite");
      final int _cursorIndexOfLicenseAgreementWebsite = CursorUtil.getColumnIndex(_cursor, "licenseAgreementWebsite");
      final int _cursorIndexOfImageDataVersion = CursorUtil.getColumnIndex(_cursor, "imageDataVersion");
      final int _cursorIndexOfAvoidCache = CursorUtil.getColumnIndex(_cursor, "avoidCache");
      final int _cursorIndexOfStickersCount = CursorUtil.getColumnIndex(_cursor, "stickersCount");
      final int _cursorIndexOfPreviewImages = CursorUtil.getColumnIndex(_cursor, "previewImages");
      final int _cursorIndexOfPackUrl = CursorUtil.getColumnIndex(_cursor, "packUrl");
      final int _cursorIndexOfDownloadSize = CursorUtil.getColumnIndex(_cursor, "downloadSize");
      final int _cursorIndexOfIsPremium = CursorUtil.getColumnIndex(_cursor, "isPremium");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<StickerPackEntity> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final StickerPackEntity _item_1;
          final String _tmpIdentifier;
          if (_cursorIndexOfIdentifier == -1) {
            _tmpIdentifier = null;
          } else {
            _tmpIdentifier = _cursor.getString(_cursorIndexOfIdentifier);
          }
          final int _tmpCategoryId;
          if (_cursorIndexOfCategoryId == -1) {
            _tmpCategoryId = 0;
          } else {
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
          }
          final String _tmpName;
          if (_cursorIndexOfName == -1) {
            _tmpName = null;
          } else {
            _tmpName = _cursor.getString(_cursorIndexOfName);
          }
          final String _tmpPublisher;
          if (_cursorIndexOfPublisher == -1) {
            _tmpPublisher = null;
          } else {
            _tmpPublisher = _cursor.getString(_cursorIndexOfPublisher);
          }
          final String _tmpTrayImageFile;
          if (_cursorIndexOfTrayImageFile == -1) {
            _tmpTrayImageFile = null;
          } else {
            _tmpTrayImageFile = _cursor.getString(_cursorIndexOfTrayImageFile);
          }
          final String _tmpPublisherEmail;
          if (_cursorIndexOfPublisherEmail == -1) {
            _tmpPublisherEmail = null;
          } else {
            _tmpPublisherEmail = _cursor.getString(_cursorIndexOfPublisherEmail);
          }
          final String _tmpPublisherWebsite;
          if (_cursorIndexOfPublisherWebsite == -1) {
            _tmpPublisherWebsite = null;
          } else {
            _tmpPublisherWebsite = _cursor.getString(_cursorIndexOfPublisherWebsite);
          }
          final String _tmpPrivacyPolicyWebsite;
          if (_cursorIndexOfPrivacyPolicyWebsite == -1) {
            _tmpPrivacyPolicyWebsite = null;
          } else {
            _tmpPrivacyPolicyWebsite = _cursor.getString(_cursorIndexOfPrivacyPolicyWebsite);
          }
          final String _tmpLicenseAgreementWebsite;
          if (_cursorIndexOfLicenseAgreementWebsite == -1) {
            _tmpLicenseAgreementWebsite = null;
          } else {
            _tmpLicenseAgreementWebsite = _cursor.getString(_cursorIndexOfLicenseAgreementWebsite);
          }
          final String _tmpImageDataVersion;
          if (_cursorIndexOfImageDataVersion == -1) {
            _tmpImageDataVersion = null;
          } else {
            _tmpImageDataVersion = _cursor.getString(_cursorIndexOfImageDataVersion);
          }
          final Boolean _tmpAvoidCache;
          if (_cursorIndexOfAvoidCache == -1) {
            _tmpAvoidCache = null;
          } else {
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfAvoidCache)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfAvoidCache);
            }
            _tmpAvoidCache = _tmp == null ? null : _tmp != 0;
          }
          final Integer _tmpStickersCount;
          if (_cursorIndexOfStickersCount == -1) {
            _tmpStickersCount = null;
          } else {
            if (_cursor.isNull(_cursorIndexOfStickersCount)) {
              _tmpStickersCount = null;
            } else {
              _tmpStickersCount = _cursor.getInt(_cursorIndexOfStickersCount);
            }
          }
          final String _tmpPreviewImages;
          if (_cursorIndexOfPreviewImages == -1) {
            _tmpPreviewImages = null;
          } else {
            _tmpPreviewImages = _cursor.getString(_cursorIndexOfPreviewImages);
          }
          final String _tmpPackUrl;
          if (_cursorIndexOfPackUrl == -1) {
            _tmpPackUrl = null;
          } else {
            _tmpPackUrl = _cursor.getString(_cursorIndexOfPackUrl);
          }
          final Long _tmpDownloadSize;
          if (_cursorIndexOfDownloadSize == -1) {
            _tmpDownloadSize = null;
          } else {
            if (_cursor.isNull(_cursorIndexOfDownloadSize)) {
              _tmpDownloadSize = null;
            } else {
              _tmpDownloadSize = _cursor.getLong(_cursorIndexOfDownloadSize);
            }
          }
          final boolean _tmpIsPremium;
          if (_cursorIndexOfIsPremium == -1) {
            _tmpIsPremium = false;
          } else {
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsPremium);
            _tmpIsPremium = _tmp_1 != 0;
          }
          _item_1 = new StickerPackEntity(_tmpIdentifier,_tmpCategoryId,_tmpName,_tmpPublisher,_tmpTrayImageFile,_tmpPublisherEmail,_tmpPublisherWebsite,_tmpPrivacyPolicyWebsite,_tmpLicenseAgreementWebsite,_tmpImageDataVersion,_tmpAvoidCache,_tmpStickersCount,_tmpPreviewImages,_tmpPackUrl,_tmpDownloadSize,_tmpIsPremium);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
