package com.hardik.stikerdemo.database;

import android.database.Cursor;
import androidx.collection.ArrayMap;
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
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class StickerPackDao_Impl extends StickerPackDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<StickerPackEntity> __insertionAdapterOfStickerPackEntity;

  private final EntityDeletionOrUpdateAdapter<StickerPackEntity> __deletionAdapterOfStickerPackEntity;

  public StickerPackDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStickerPackEntity = new EntityInsertionAdapter<StickerPackEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `StickerPackEntity` (`identifier`,`categoryId`,`name`,`publisher`,`trayImageFile`,`publisherEmail`,`publisherWebsite`,`privacyPolicyWebsite`,`licenseAgreementWebsite`,`imageDataVersion`,`avoidCache`,`stickersCount`,`previewImages`,`packUrl`,`downloadSize`,`isPremium`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StickerPackEntity value) {
        if (value.getIdentifier() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getIdentifier());
        }
        stmt.bindLong(2, value.getCategoryId());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getPublisher() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPublisher());
        }
        if (value.getTrayImageFile() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTrayImageFile());
        }
        if (value.getPublisherEmail() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPublisherEmail());
        }
        if (value.getPublisherWebsite() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPublisherWebsite());
        }
        if (value.getPrivacyPolicyWebsite() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPrivacyPolicyWebsite());
        }
        if (value.getLicenseAgreementWebsite() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getLicenseAgreementWebsite());
        }
        if (value.getImageDataVersion() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getImageDataVersion());
        }
        final Integer _tmp;
        _tmp = value.getAvoidCache() == null ? null : (value.getAvoidCache() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, _tmp);
        }
        if (value.getStickersCount() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, value.getStickersCount());
        }
        if (value.getPreviewImages() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getPreviewImages());
        }
        if (value.getPackUrl() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getPackUrl());
        }
        if (value.getDownloadSize() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindLong(15, value.getDownloadSize());
        }
        final int _tmp_1;
        _tmp_1 = value.isPremium() ? 1 : 0;
        stmt.bindLong(16, _tmp_1);
      }
    };
    this.__deletionAdapterOfStickerPackEntity = new EntityDeletionOrUpdateAdapter<StickerPackEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `StickerPackEntity` WHERE `identifier` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StickerPackEntity value) {
        if (value.getIdentifier() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getIdentifier());
        }
      }
    };
  }

  @Override
  public Object insert(final StickerPackEntity[] obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStickerPackEntity.insert(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final StickerPackEntity obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStickerPackEntity.insert(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertAll(final List<? extends StickerPackEntity> listObj,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStickerPackEntity.insert(listObj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final StickerPackEntity obj, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfStickerPackEntity.handle(obj);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getStickerPack(final Continuation<? super List<StickerPackEntity>> p0) {
    final String _sql = "SELECT * FROM StickerPackEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<StickerPackEntity>>() {
      @Override
      public List<StickerPackEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "identifier");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPublisher = CursorUtil.getColumnIndexOrThrow(_cursor, "publisher");
          final int _cursorIndexOfTrayImageFile = CursorUtil.getColumnIndexOrThrow(_cursor, "trayImageFile");
          final int _cursorIndexOfPublisherEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "publisherEmail");
          final int _cursorIndexOfPublisherWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "publisherWebsite");
          final int _cursorIndexOfPrivacyPolicyWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "privacyPolicyWebsite");
          final int _cursorIndexOfLicenseAgreementWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "licenseAgreementWebsite");
          final int _cursorIndexOfImageDataVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "imageDataVersion");
          final int _cursorIndexOfAvoidCache = CursorUtil.getColumnIndexOrThrow(_cursor, "avoidCache");
          final int _cursorIndexOfStickersCount = CursorUtil.getColumnIndexOrThrow(_cursor, "stickersCount");
          final int _cursorIndexOfPreviewImages = CursorUtil.getColumnIndexOrThrow(_cursor, "previewImages");
          final int _cursorIndexOfPackUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "packUrl");
          final int _cursorIndexOfDownloadSize = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadSize");
          final int _cursorIndexOfIsPremium = CursorUtil.getColumnIndexOrThrow(_cursor, "isPremium");
          final List<StickerPackEntity> _result = new ArrayList<StickerPackEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StickerPackEntity _item;
            final String _tmpIdentifier;
            _tmpIdentifier = _cursor.getString(_cursorIndexOfIdentifier);
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpPublisher;
            _tmpPublisher = _cursor.getString(_cursorIndexOfPublisher);
            final String _tmpTrayImageFile;
            _tmpTrayImageFile = _cursor.getString(_cursorIndexOfTrayImageFile);
            final String _tmpPublisherEmail;
            _tmpPublisherEmail = _cursor.getString(_cursorIndexOfPublisherEmail);
            final String _tmpPublisherWebsite;
            _tmpPublisherWebsite = _cursor.getString(_cursorIndexOfPublisherWebsite);
            final String _tmpPrivacyPolicyWebsite;
            _tmpPrivacyPolicyWebsite = _cursor.getString(_cursorIndexOfPrivacyPolicyWebsite);
            final String _tmpLicenseAgreementWebsite;
            _tmpLicenseAgreementWebsite = _cursor.getString(_cursorIndexOfLicenseAgreementWebsite);
            final String _tmpImageDataVersion;
            _tmpImageDataVersion = _cursor.getString(_cursorIndexOfImageDataVersion);
            final Boolean _tmpAvoidCache;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfAvoidCache)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfAvoidCache);
            }
            _tmpAvoidCache = _tmp == null ? null : _tmp != 0;
            final Integer _tmpStickersCount;
            if (_cursor.isNull(_cursorIndexOfStickersCount)) {
              _tmpStickersCount = null;
            } else {
              _tmpStickersCount = _cursor.getInt(_cursorIndexOfStickersCount);
            }
            final String _tmpPreviewImages;
            _tmpPreviewImages = _cursor.getString(_cursorIndexOfPreviewImages);
            final String _tmpPackUrl;
            _tmpPackUrl = _cursor.getString(_cursorIndexOfPackUrl);
            final Long _tmpDownloadSize;
            if (_cursor.isNull(_cursorIndexOfDownloadSize)) {
              _tmpDownloadSize = null;
            } else {
              _tmpDownloadSize = _cursor.getLong(_cursorIndexOfDownloadSize);
            }
            final boolean _tmpIsPremium;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsPremium);
            _tmpIsPremium = _tmp_1 != 0;
            _item = new StickerPackEntity(_tmpIdentifier,_tmpCategoryId,_tmpName,_tmpPublisher,_tmpTrayImageFile,_tmpPublisherEmail,_tmpPublisherWebsite,_tmpPrivacyPolicyWebsite,_tmpLicenseAgreementWebsite,_tmpImageDataVersion,_tmpAvoidCache,_tmpStickersCount,_tmpPreviewImages,_tmpPackUrl,_tmpDownloadSize,_tmpIsPremium);
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
  public LiveData<List<StickerPackEntity>> getStickerPackLiveData() {
    final String _sql = "SELECT * FROM StickerPackEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"StickerPackEntity"}, false, new Callable<List<StickerPackEntity>>() {
      @Override
      public List<StickerPackEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "identifier");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPublisher = CursorUtil.getColumnIndexOrThrow(_cursor, "publisher");
          final int _cursorIndexOfTrayImageFile = CursorUtil.getColumnIndexOrThrow(_cursor, "trayImageFile");
          final int _cursorIndexOfPublisherEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "publisherEmail");
          final int _cursorIndexOfPublisherWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "publisherWebsite");
          final int _cursorIndexOfPrivacyPolicyWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "privacyPolicyWebsite");
          final int _cursorIndexOfLicenseAgreementWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "licenseAgreementWebsite");
          final int _cursorIndexOfImageDataVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "imageDataVersion");
          final int _cursorIndexOfAvoidCache = CursorUtil.getColumnIndexOrThrow(_cursor, "avoidCache");
          final int _cursorIndexOfStickersCount = CursorUtil.getColumnIndexOrThrow(_cursor, "stickersCount");
          final int _cursorIndexOfPreviewImages = CursorUtil.getColumnIndexOrThrow(_cursor, "previewImages");
          final int _cursorIndexOfPackUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "packUrl");
          final int _cursorIndexOfDownloadSize = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadSize");
          final int _cursorIndexOfIsPremium = CursorUtil.getColumnIndexOrThrow(_cursor, "isPremium");
          final List<StickerPackEntity> _result = new ArrayList<StickerPackEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StickerPackEntity _item;
            final String _tmpIdentifier;
            _tmpIdentifier = _cursor.getString(_cursorIndexOfIdentifier);
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpPublisher;
            _tmpPublisher = _cursor.getString(_cursorIndexOfPublisher);
            final String _tmpTrayImageFile;
            _tmpTrayImageFile = _cursor.getString(_cursorIndexOfTrayImageFile);
            final String _tmpPublisherEmail;
            _tmpPublisherEmail = _cursor.getString(_cursorIndexOfPublisherEmail);
            final String _tmpPublisherWebsite;
            _tmpPublisherWebsite = _cursor.getString(_cursorIndexOfPublisherWebsite);
            final String _tmpPrivacyPolicyWebsite;
            _tmpPrivacyPolicyWebsite = _cursor.getString(_cursorIndexOfPrivacyPolicyWebsite);
            final String _tmpLicenseAgreementWebsite;
            _tmpLicenseAgreementWebsite = _cursor.getString(_cursorIndexOfLicenseAgreementWebsite);
            final String _tmpImageDataVersion;
            _tmpImageDataVersion = _cursor.getString(_cursorIndexOfImageDataVersion);
            final Boolean _tmpAvoidCache;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfAvoidCache)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfAvoidCache);
            }
            _tmpAvoidCache = _tmp == null ? null : _tmp != 0;
            final Integer _tmpStickersCount;
            if (_cursor.isNull(_cursorIndexOfStickersCount)) {
              _tmpStickersCount = null;
            } else {
              _tmpStickersCount = _cursor.getInt(_cursorIndexOfStickersCount);
            }
            final String _tmpPreviewImages;
            _tmpPreviewImages = _cursor.getString(_cursorIndexOfPreviewImages);
            final String _tmpPackUrl;
            _tmpPackUrl = _cursor.getString(_cursorIndexOfPackUrl);
            final Long _tmpDownloadSize;
            if (_cursor.isNull(_cursorIndexOfDownloadSize)) {
              _tmpDownloadSize = null;
            } else {
              _tmpDownloadSize = _cursor.getLong(_cursorIndexOfDownloadSize);
            }
            final boolean _tmpIsPremium;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsPremium);
            _tmpIsPremium = _tmp_1 != 0;
            _item = new StickerPackEntity(_tmpIdentifier,_tmpCategoryId,_tmpName,_tmpPublisher,_tmpTrayImageFile,_tmpPublisherEmail,_tmpPublisherWebsite,_tmpPrivacyPolicyWebsite,_tmpLicenseAgreementWebsite,_tmpImageDataVersion,_tmpAvoidCache,_tmpStickersCount,_tmpPreviewImages,_tmpPackUrl,_tmpDownloadSize,_tmpIsPremium);
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
  public Object getStickerPackBySearch(final Continuation<? super List<StickerPackEntity>> p0) {
    final String _sql = "SELECT * FROM StickerPackEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<StickerPackEntity>>() {
      @Override
      public List<StickerPackEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "identifier");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPublisher = CursorUtil.getColumnIndexOrThrow(_cursor, "publisher");
          final int _cursorIndexOfTrayImageFile = CursorUtil.getColumnIndexOrThrow(_cursor, "trayImageFile");
          final int _cursorIndexOfPublisherEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "publisherEmail");
          final int _cursorIndexOfPublisherWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "publisherWebsite");
          final int _cursorIndexOfPrivacyPolicyWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "privacyPolicyWebsite");
          final int _cursorIndexOfLicenseAgreementWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "licenseAgreementWebsite");
          final int _cursorIndexOfImageDataVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "imageDataVersion");
          final int _cursorIndexOfAvoidCache = CursorUtil.getColumnIndexOrThrow(_cursor, "avoidCache");
          final int _cursorIndexOfStickersCount = CursorUtil.getColumnIndexOrThrow(_cursor, "stickersCount");
          final int _cursorIndexOfPreviewImages = CursorUtil.getColumnIndexOrThrow(_cursor, "previewImages");
          final int _cursorIndexOfPackUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "packUrl");
          final int _cursorIndexOfDownloadSize = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadSize");
          final int _cursorIndexOfIsPremium = CursorUtil.getColumnIndexOrThrow(_cursor, "isPremium");
          final List<StickerPackEntity> _result = new ArrayList<StickerPackEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StickerPackEntity _item;
            final String _tmpIdentifier;
            _tmpIdentifier = _cursor.getString(_cursorIndexOfIdentifier);
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpPublisher;
            _tmpPublisher = _cursor.getString(_cursorIndexOfPublisher);
            final String _tmpTrayImageFile;
            _tmpTrayImageFile = _cursor.getString(_cursorIndexOfTrayImageFile);
            final String _tmpPublisherEmail;
            _tmpPublisherEmail = _cursor.getString(_cursorIndexOfPublisherEmail);
            final String _tmpPublisherWebsite;
            _tmpPublisherWebsite = _cursor.getString(_cursorIndexOfPublisherWebsite);
            final String _tmpPrivacyPolicyWebsite;
            _tmpPrivacyPolicyWebsite = _cursor.getString(_cursorIndexOfPrivacyPolicyWebsite);
            final String _tmpLicenseAgreementWebsite;
            _tmpLicenseAgreementWebsite = _cursor.getString(_cursorIndexOfLicenseAgreementWebsite);
            final String _tmpImageDataVersion;
            _tmpImageDataVersion = _cursor.getString(_cursorIndexOfImageDataVersion);
            final Boolean _tmpAvoidCache;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfAvoidCache)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfAvoidCache);
            }
            _tmpAvoidCache = _tmp == null ? null : _tmp != 0;
            final Integer _tmpStickersCount;
            if (_cursor.isNull(_cursorIndexOfStickersCount)) {
              _tmpStickersCount = null;
            } else {
              _tmpStickersCount = _cursor.getInt(_cursorIndexOfStickersCount);
            }
            final String _tmpPreviewImages;
            _tmpPreviewImages = _cursor.getString(_cursorIndexOfPreviewImages);
            final String _tmpPackUrl;
            _tmpPackUrl = _cursor.getString(_cursorIndexOfPackUrl);
            final Long _tmpDownloadSize;
            if (_cursor.isNull(_cursorIndexOfDownloadSize)) {
              _tmpDownloadSize = null;
            } else {
              _tmpDownloadSize = _cursor.getLong(_cursorIndexOfDownloadSize);
            }
            final boolean _tmpIsPremium;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsPremium);
            _tmpIsPremium = _tmp_1 != 0;
            _item = new StickerPackEntity(_tmpIdentifier,_tmpCategoryId,_tmpName,_tmpPublisher,_tmpTrayImageFile,_tmpPublisherEmail,_tmpPublisherWebsite,_tmpPrivacyPolicyWebsite,_tmpLicenseAgreementWebsite,_tmpImageDataVersion,_tmpAvoidCache,_tmpStickersCount,_tmpPreviewImages,_tmpPackUrl,_tmpDownloadSize,_tmpIsPremium);
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
  public Object getStickerPackAndSticker(
      final Continuation<? super List<StickerPackAndSticker>> p0) {
    final String _sql = "SELECT * FROM StickerPackEntity WHERE identifier IN(SELECT DISTINCT(packIdentifier) FROM StickerEntity)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, true, new Callable<List<StickerPackAndSticker>>() {
      @Override
      public List<StickerPackAndSticker> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfIdentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "identifier");
            final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
            final int _cursorIndexOfPublisher = CursorUtil.getColumnIndexOrThrow(_cursor, "publisher");
            final int _cursorIndexOfTrayImageFile = CursorUtil.getColumnIndexOrThrow(_cursor, "trayImageFile");
            final int _cursorIndexOfPublisherEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "publisherEmail");
            final int _cursorIndexOfPublisherWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "publisherWebsite");
            final int _cursorIndexOfPrivacyPolicyWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "privacyPolicyWebsite");
            final int _cursorIndexOfLicenseAgreementWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "licenseAgreementWebsite");
            final int _cursorIndexOfImageDataVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "imageDataVersion");
            final int _cursorIndexOfAvoidCache = CursorUtil.getColumnIndexOrThrow(_cursor, "avoidCache");
            final int _cursorIndexOfStickersCount = CursorUtil.getColumnIndexOrThrow(_cursor, "stickersCount");
            final int _cursorIndexOfPreviewImages = CursorUtil.getColumnIndexOrThrow(_cursor, "previewImages");
            final int _cursorIndexOfPackUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "packUrl");
            final int _cursorIndexOfDownloadSize = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadSize");
            final int _cursorIndexOfIsPremium = CursorUtil.getColumnIndexOrThrow(_cursor, "isPremium");
            final ArrayMap<String, ArrayList<StickerEntity>> _collectionSticker = new ArrayMap<String, ArrayList<StickerEntity>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfIdentifier);
              ArrayList<StickerEntity> _tmpStickerCollection = _collectionSticker.get(_tmpKey);
              if (_tmpStickerCollection == null) {
                _tmpStickerCollection = new ArrayList<StickerEntity>();
                _collectionSticker.put(_tmpKey, _tmpStickerCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipStickerEntityAscomDuckinfotechStikerdemoDatabaseStickerEntity(_collectionSticker);
            final List<StickerPackAndSticker> _result = new ArrayList<StickerPackAndSticker>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final StickerPackAndSticker _item;
              final StickerPackEntity _tmpStickerPackEntity;
              if (! (_cursor.isNull(_cursorIndexOfIdentifier) && _cursor.isNull(_cursorIndexOfCategoryId) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfPublisher) && _cursor.isNull(_cursorIndexOfTrayImageFile) && _cursor.isNull(_cursorIndexOfPublisherEmail) && _cursor.isNull(_cursorIndexOfPublisherWebsite) && _cursor.isNull(_cursorIndexOfPrivacyPolicyWebsite) && _cursor.isNull(_cursorIndexOfLicenseAgreementWebsite) && _cursor.isNull(_cursorIndexOfImageDataVersion) && _cursor.isNull(_cursorIndexOfAvoidCache) && _cursor.isNull(_cursorIndexOfStickersCount) && _cursor.isNull(_cursorIndexOfPreviewImages) && _cursor.isNull(_cursorIndexOfPackUrl) && _cursor.isNull(_cursorIndexOfDownloadSize) && _cursor.isNull(_cursorIndexOfIsPremium))) {
                final String _tmpIdentifier;
                _tmpIdentifier = _cursor.getString(_cursorIndexOfIdentifier);
                final int _tmpCategoryId;
                _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
                final String _tmpName;
                _tmpName = _cursor.getString(_cursorIndexOfName);
                final String _tmpPublisher;
                _tmpPublisher = _cursor.getString(_cursorIndexOfPublisher);
                final String _tmpTrayImageFile;
                _tmpTrayImageFile = _cursor.getString(_cursorIndexOfTrayImageFile);
                final String _tmpPublisherEmail;
                _tmpPublisherEmail = _cursor.getString(_cursorIndexOfPublisherEmail);
                final String _tmpPublisherWebsite;
                _tmpPublisherWebsite = _cursor.getString(_cursorIndexOfPublisherWebsite);
                final String _tmpPrivacyPolicyWebsite;
                _tmpPrivacyPolicyWebsite = _cursor.getString(_cursorIndexOfPrivacyPolicyWebsite);
                final String _tmpLicenseAgreementWebsite;
                _tmpLicenseAgreementWebsite = _cursor.getString(_cursorIndexOfLicenseAgreementWebsite);
                final String _tmpImageDataVersion;
                _tmpImageDataVersion = _cursor.getString(_cursorIndexOfImageDataVersion);
                final Boolean _tmpAvoidCache;
                final Integer _tmp;
                if (_cursor.isNull(_cursorIndexOfAvoidCache)) {
                  _tmp = null;
                } else {
                  _tmp = _cursor.getInt(_cursorIndexOfAvoidCache);
                }
                _tmpAvoidCache = _tmp == null ? null : _tmp != 0;
                final Integer _tmpStickersCount;
                if (_cursor.isNull(_cursorIndexOfStickersCount)) {
                  _tmpStickersCount = null;
                } else {
                  _tmpStickersCount = _cursor.getInt(_cursorIndexOfStickersCount);
                }
                final String _tmpPreviewImages;
                _tmpPreviewImages = _cursor.getString(_cursorIndexOfPreviewImages);
                final String _tmpPackUrl;
                _tmpPackUrl = _cursor.getString(_cursorIndexOfPackUrl);
                final Long _tmpDownloadSize;
                if (_cursor.isNull(_cursorIndexOfDownloadSize)) {
                  _tmpDownloadSize = null;
                } else {
                  _tmpDownloadSize = _cursor.getLong(_cursorIndexOfDownloadSize);
                }
                final boolean _tmpIsPremium;
                final int _tmp_1;
                _tmp_1 = _cursor.getInt(_cursorIndexOfIsPremium);
                _tmpIsPremium = _tmp_1 != 0;
                _tmpStickerPackEntity = new StickerPackEntity(_tmpIdentifier,_tmpCategoryId,_tmpName,_tmpPublisher,_tmpTrayImageFile,_tmpPublisherEmail,_tmpPublisherWebsite,_tmpPrivacyPolicyWebsite,_tmpLicenseAgreementWebsite,_tmpImageDataVersion,_tmpAvoidCache,_tmpStickersCount,_tmpPreviewImages,_tmpPackUrl,_tmpDownloadSize,_tmpIsPremium);
              }  else  {
                _tmpStickerPackEntity = null;
              }
              ArrayList<StickerEntity> _tmpStickerCollection_1 = null;
              final String _tmpKey_1 = _cursor.getString(_cursorIndexOfIdentifier);
              _tmpStickerCollection_1 = _collectionSticker.get(_tmpKey_1);
              if (_tmpStickerCollection_1 == null) {
                _tmpStickerCollection_1 = new ArrayList<StickerEntity>();
              }
              _item = new StickerPackAndSticker(_tmpStickerPackEntity,_tmpStickerCollection_1);
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
  public Object getStickerPackAndStickerByIdentifier(final String identifier,
      final Continuation<? super StickerPackAndSticker> p1) {
    final String _sql = "SELECT * FROM StickerPackEntity WHERE identifier = ? IN(SELECT DISTINCT(packIdentifier) FROM StickerEntity)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (identifier == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, identifier);
    }
    return CoroutinesRoom.execute(__db, true, new Callable<StickerPackAndSticker>() {
      @Override
      public StickerPackAndSticker call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfIdentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "identifier");
            final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
            final int _cursorIndexOfPublisher = CursorUtil.getColumnIndexOrThrow(_cursor, "publisher");
            final int _cursorIndexOfTrayImageFile = CursorUtil.getColumnIndexOrThrow(_cursor, "trayImageFile");
            final int _cursorIndexOfPublisherEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "publisherEmail");
            final int _cursorIndexOfPublisherWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "publisherWebsite");
            final int _cursorIndexOfPrivacyPolicyWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "privacyPolicyWebsite");
            final int _cursorIndexOfLicenseAgreementWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "licenseAgreementWebsite");
            final int _cursorIndexOfImageDataVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "imageDataVersion");
            final int _cursorIndexOfAvoidCache = CursorUtil.getColumnIndexOrThrow(_cursor, "avoidCache");
            final int _cursorIndexOfStickersCount = CursorUtil.getColumnIndexOrThrow(_cursor, "stickersCount");
            final int _cursorIndexOfPreviewImages = CursorUtil.getColumnIndexOrThrow(_cursor, "previewImages");
            final int _cursorIndexOfPackUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "packUrl");
            final int _cursorIndexOfDownloadSize = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadSize");
            final int _cursorIndexOfIsPremium = CursorUtil.getColumnIndexOrThrow(_cursor, "isPremium");
            final ArrayMap<String, ArrayList<StickerEntity>> _collectionSticker = new ArrayMap<String, ArrayList<StickerEntity>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfIdentifier);
              ArrayList<StickerEntity> _tmpStickerCollection = _collectionSticker.get(_tmpKey);
              if (_tmpStickerCollection == null) {
                _tmpStickerCollection = new ArrayList<StickerEntity>();
                _collectionSticker.put(_tmpKey, _tmpStickerCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipStickerEntityAscomDuckinfotechStikerdemoDatabaseStickerEntity(_collectionSticker);
            final StickerPackAndSticker _result;
            if(_cursor.moveToFirst()) {
              final StickerPackEntity _tmpStickerPackEntity;
              if (! (_cursor.isNull(_cursorIndexOfIdentifier) && _cursor.isNull(_cursorIndexOfCategoryId) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfPublisher) && _cursor.isNull(_cursorIndexOfTrayImageFile) && _cursor.isNull(_cursorIndexOfPublisherEmail) && _cursor.isNull(_cursorIndexOfPublisherWebsite) && _cursor.isNull(_cursorIndexOfPrivacyPolicyWebsite) && _cursor.isNull(_cursorIndexOfLicenseAgreementWebsite) && _cursor.isNull(_cursorIndexOfImageDataVersion) && _cursor.isNull(_cursorIndexOfAvoidCache) && _cursor.isNull(_cursorIndexOfStickersCount) && _cursor.isNull(_cursorIndexOfPreviewImages) && _cursor.isNull(_cursorIndexOfPackUrl) && _cursor.isNull(_cursorIndexOfDownloadSize) && _cursor.isNull(_cursorIndexOfIsPremium))) {
                final String _tmpIdentifier;
                _tmpIdentifier = _cursor.getString(_cursorIndexOfIdentifier);
                final int _tmpCategoryId;
                _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
                final String _tmpName;
                _tmpName = _cursor.getString(_cursorIndexOfName);
                final String _tmpPublisher;
                _tmpPublisher = _cursor.getString(_cursorIndexOfPublisher);
                final String _tmpTrayImageFile;
                _tmpTrayImageFile = _cursor.getString(_cursorIndexOfTrayImageFile);
                final String _tmpPublisherEmail;
                _tmpPublisherEmail = _cursor.getString(_cursorIndexOfPublisherEmail);
                final String _tmpPublisherWebsite;
                _tmpPublisherWebsite = _cursor.getString(_cursorIndexOfPublisherWebsite);
                final String _tmpPrivacyPolicyWebsite;
                _tmpPrivacyPolicyWebsite = _cursor.getString(_cursorIndexOfPrivacyPolicyWebsite);
                final String _tmpLicenseAgreementWebsite;
                _tmpLicenseAgreementWebsite = _cursor.getString(_cursorIndexOfLicenseAgreementWebsite);
                final String _tmpImageDataVersion;
                _tmpImageDataVersion = _cursor.getString(_cursorIndexOfImageDataVersion);
                final Boolean _tmpAvoidCache;
                final Integer _tmp;
                if (_cursor.isNull(_cursorIndexOfAvoidCache)) {
                  _tmp = null;
                } else {
                  _tmp = _cursor.getInt(_cursorIndexOfAvoidCache);
                }
                _tmpAvoidCache = _tmp == null ? null : _tmp != 0;
                final Integer _tmpStickersCount;
                if (_cursor.isNull(_cursorIndexOfStickersCount)) {
                  _tmpStickersCount = null;
                } else {
                  _tmpStickersCount = _cursor.getInt(_cursorIndexOfStickersCount);
                }
                final String _tmpPreviewImages;
                _tmpPreviewImages = _cursor.getString(_cursorIndexOfPreviewImages);
                final String _tmpPackUrl;
                _tmpPackUrl = _cursor.getString(_cursorIndexOfPackUrl);
                final Long _tmpDownloadSize;
                if (_cursor.isNull(_cursorIndexOfDownloadSize)) {
                  _tmpDownloadSize = null;
                } else {
                  _tmpDownloadSize = _cursor.getLong(_cursorIndexOfDownloadSize);
                }
                final boolean _tmpIsPremium;
                final int _tmp_1;
                _tmp_1 = _cursor.getInt(_cursorIndexOfIsPremium);
                _tmpIsPremium = _tmp_1 != 0;
                _tmpStickerPackEntity = new StickerPackEntity(_tmpIdentifier,_tmpCategoryId,_tmpName,_tmpPublisher,_tmpTrayImageFile,_tmpPublisherEmail,_tmpPublisherWebsite,_tmpPrivacyPolicyWebsite,_tmpLicenseAgreementWebsite,_tmpImageDataVersion,_tmpAvoidCache,_tmpStickersCount,_tmpPreviewImages,_tmpPackUrl,_tmpDownloadSize,_tmpIsPremium);
              }  else  {
                _tmpStickerPackEntity = null;
              }
              ArrayList<StickerEntity> _tmpStickerCollection_1 = null;
              final String _tmpKey_1 = _cursor.getString(_cursorIndexOfIdentifier);
              _tmpStickerCollection_1 = _collectionSticker.get(_tmpKey_1);
              if (_tmpStickerCollection_1 == null) {
                _tmpStickerCollection_1 = new ArrayList<StickerEntity>();
              }
              _result = new StickerPackAndSticker(_tmpStickerPackEntity,_tmpStickerCollection_1);
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
  public Object getStickerPackByIdentifier(final String identifier,
      final Continuation<? super StickerPackEntity> p1) {
    final String _sql = "SELECT * FROM StickerPackEntity WHERE identifier = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (identifier == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, identifier);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<StickerPackEntity>() {
      @Override
      public StickerPackEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "identifier");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPublisher = CursorUtil.getColumnIndexOrThrow(_cursor, "publisher");
          final int _cursorIndexOfTrayImageFile = CursorUtil.getColumnIndexOrThrow(_cursor, "trayImageFile");
          final int _cursorIndexOfPublisherEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "publisherEmail");
          final int _cursorIndexOfPublisherWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "publisherWebsite");
          final int _cursorIndexOfPrivacyPolicyWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "privacyPolicyWebsite");
          final int _cursorIndexOfLicenseAgreementWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "licenseAgreementWebsite");
          final int _cursorIndexOfImageDataVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "imageDataVersion");
          final int _cursorIndexOfAvoidCache = CursorUtil.getColumnIndexOrThrow(_cursor, "avoidCache");
          final int _cursorIndexOfStickersCount = CursorUtil.getColumnIndexOrThrow(_cursor, "stickersCount");
          final int _cursorIndexOfPreviewImages = CursorUtil.getColumnIndexOrThrow(_cursor, "previewImages");
          final int _cursorIndexOfPackUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "packUrl");
          final int _cursorIndexOfDownloadSize = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadSize");
          final int _cursorIndexOfIsPremium = CursorUtil.getColumnIndexOrThrow(_cursor, "isPremium");
          final StickerPackEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpIdentifier;
            _tmpIdentifier = _cursor.getString(_cursorIndexOfIdentifier);
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpPublisher;
            _tmpPublisher = _cursor.getString(_cursorIndexOfPublisher);
            final String _tmpTrayImageFile;
            _tmpTrayImageFile = _cursor.getString(_cursorIndexOfTrayImageFile);
            final String _tmpPublisherEmail;
            _tmpPublisherEmail = _cursor.getString(_cursorIndexOfPublisherEmail);
            final String _tmpPublisherWebsite;
            _tmpPublisherWebsite = _cursor.getString(_cursorIndexOfPublisherWebsite);
            final String _tmpPrivacyPolicyWebsite;
            _tmpPrivacyPolicyWebsite = _cursor.getString(_cursorIndexOfPrivacyPolicyWebsite);
            final String _tmpLicenseAgreementWebsite;
            _tmpLicenseAgreementWebsite = _cursor.getString(_cursorIndexOfLicenseAgreementWebsite);
            final String _tmpImageDataVersion;
            _tmpImageDataVersion = _cursor.getString(_cursorIndexOfImageDataVersion);
            final Boolean _tmpAvoidCache;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfAvoidCache)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfAvoidCache);
            }
            _tmpAvoidCache = _tmp == null ? null : _tmp != 0;
            final Integer _tmpStickersCount;
            if (_cursor.isNull(_cursorIndexOfStickersCount)) {
              _tmpStickersCount = null;
            } else {
              _tmpStickersCount = _cursor.getInt(_cursorIndexOfStickersCount);
            }
            final String _tmpPreviewImages;
            _tmpPreviewImages = _cursor.getString(_cursorIndexOfPreviewImages);
            final String _tmpPackUrl;
            _tmpPackUrl = _cursor.getString(_cursorIndexOfPackUrl);
            final Long _tmpDownloadSize;
            if (_cursor.isNull(_cursorIndexOfDownloadSize)) {
              _tmpDownloadSize = null;
            } else {
              _tmpDownloadSize = _cursor.getLong(_cursorIndexOfDownloadSize);
            }
            final boolean _tmpIsPremium;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsPremium);
            _tmpIsPremium = _tmp_1 != 0;
            _result = new StickerPackEntity(_tmpIdentifier,_tmpCategoryId,_tmpName,_tmpPublisher,_tmpTrayImageFile,_tmpPublisherEmail,_tmpPublisherWebsite,_tmpPrivacyPolicyWebsite,_tmpLicenseAgreementWebsite,_tmpImageDataVersion,_tmpAvoidCache,_tmpStickersCount,_tmpPreviewImages,_tmpPackUrl,_tmpDownloadSize,_tmpIsPremium);
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
  public List<StickerPackEntity> getStickerPackByIdentifierOneShot(final String identifier) {
    final String _sql = "SELECT * FROM StickerPackEntity WHERE identifier = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (identifier == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, identifier);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfIdentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "identifier");
      final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPublisher = CursorUtil.getColumnIndexOrThrow(_cursor, "publisher");
      final int _cursorIndexOfTrayImageFile = CursorUtil.getColumnIndexOrThrow(_cursor, "trayImageFile");
      final int _cursorIndexOfPublisherEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "publisherEmail");
      final int _cursorIndexOfPublisherWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "publisherWebsite");
      final int _cursorIndexOfPrivacyPolicyWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "privacyPolicyWebsite");
      final int _cursorIndexOfLicenseAgreementWebsite = CursorUtil.getColumnIndexOrThrow(_cursor, "licenseAgreementWebsite");
      final int _cursorIndexOfImageDataVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "imageDataVersion");
      final int _cursorIndexOfAvoidCache = CursorUtil.getColumnIndexOrThrow(_cursor, "avoidCache");
      final int _cursorIndexOfStickersCount = CursorUtil.getColumnIndexOrThrow(_cursor, "stickersCount");
      final int _cursorIndexOfPreviewImages = CursorUtil.getColumnIndexOrThrow(_cursor, "previewImages");
      final int _cursorIndexOfPackUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "packUrl");
      final int _cursorIndexOfDownloadSize = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadSize");
      final int _cursorIndexOfIsPremium = CursorUtil.getColumnIndexOrThrow(_cursor, "isPremium");
      final List<StickerPackEntity> _result = new ArrayList<StickerPackEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final StickerPackEntity _item;
        final String _tmpIdentifier;
        _tmpIdentifier = _cursor.getString(_cursorIndexOfIdentifier);
        final int _tmpCategoryId;
        _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpPublisher;
        _tmpPublisher = _cursor.getString(_cursorIndexOfPublisher);
        final String _tmpTrayImageFile;
        _tmpTrayImageFile = _cursor.getString(_cursorIndexOfTrayImageFile);
        final String _tmpPublisherEmail;
        _tmpPublisherEmail = _cursor.getString(_cursorIndexOfPublisherEmail);
        final String _tmpPublisherWebsite;
        _tmpPublisherWebsite = _cursor.getString(_cursorIndexOfPublisherWebsite);
        final String _tmpPrivacyPolicyWebsite;
        _tmpPrivacyPolicyWebsite = _cursor.getString(_cursorIndexOfPrivacyPolicyWebsite);
        final String _tmpLicenseAgreementWebsite;
        _tmpLicenseAgreementWebsite = _cursor.getString(_cursorIndexOfLicenseAgreementWebsite);
        final String _tmpImageDataVersion;
        _tmpImageDataVersion = _cursor.getString(_cursorIndexOfImageDataVersion);
        final Boolean _tmpAvoidCache;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfAvoidCache)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfAvoidCache);
        }
        _tmpAvoidCache = _tmp == null ? null : _tmp != 0;
        final Integer _tmpStickersCount;
        if (_cursor.isNull(_cursorIndexOfStickersCount)) {
          _tmpStickersCount = null;
        } else {
          _tmpStickersCount = _cursor.getInt(_cursorIndexOfStickersCount);
        }
        final String _tmpPreviewImages;
        _tmpPreviewImages = _cursor.getString(_cursorIndexOfPreviewImages);
        final String _tmpPackUrl;
        _tmpPackUrl = _cursor.getString(_cursorIndexOfPackUrl);
        final Long _tmpDownloadSize;
        if (_cursor.isNull(_cursorIndexOfDownloadSize)) {
          _tmpDownloadSize = null;
        } else {
          _tmpDownloadSize = _cursor.getLong(_cursorIndexOfDownloadSize);
        }
        final boolean _tmpIsPremium;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsPremium);
        _tmpIsPremium = _tmp_1 != 0;
        _item = new StickerPackEntity(_tmpIdentifier,_tmpCategoryId,_tmpName,_tmpPublisher,_tmpTrayImageFile,_tmpPublisherEmail,_tmpPublisherWebsite,_tmpPrivacyPolicyWebsite,_tmpLicenseAgreementWebsite,_tmpImageDataVersion,_tmpAvoidCache,_tmpStickersCount,_tmpPreviewImages,_tmpPackUrl,_tmpDownloadSize,_tmpIsPremium);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  private void __fetchRelationshipStickerEntityAscomDuckinfotechStikerdemoDatabaseStickerEntity(
      final ArrayMap<String, ArrayList<StickerEntity>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      ArrayMap<String, ArrayList<StickerEntity>> _tmpInnerMap = new ArrayMap<String, ArrayList<StickerEntity>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipStickerEntityAscomDuckinfotechStikerdemoDatabaseStickerEntity(_tmpInnerMap);
          _tmpInnerMap = new ArrayMap<String, ArrayList<StickerEntity>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipStickerEntityAscomDuckinfotechStikerdemoDatabaseStickerEntity(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`categoryId`,`packIdentifier`,`imageFileName`,`emojis` FROM `StickerEntity` WHERE `packIdentifier` IN (");
    final int _inputSize = __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : __mapKeySet) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "packIdentifier");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "id");
      final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndex(_cursor, "categoryId");
      final int _cursorIndexOfPackIdentifier = CursorUtil.getColumnIndex(_cursor, "packIdentifier");
      final int _cursorIndexOfImageFileName = CursorUtil.getColumnIndex(_cursor, "imageFileName");
      final int _cursorIndexOfEmojis = CursorUtil.getColumnIndex(_cursor, "emojis");
      while(_cursor.moveToNext()) {
        final String _tmpKey = _cursor.getString(_itemKeyIndex);
        ArrayList<StickerEntity> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final StickerEntity _item_1;
          final int _tmpCategoryId;
          if (_cursorIndexOfCategoryId == -1) {
            _tmpCategoryId = 0;
          } else {
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
          }
          final String _tmpPackIdentifier;
          if (_cursorIndexOfPackIdentifier == -1) {
            _tmpPackIdentifier = null;
          } else {
            _tmpPackIdentifier = _cursor.getString(_cursorIndexOfPackIdentifier);
          }
          final String _tmpImageFileName;
          if (_cursorIndexOfImageFileName == -1) {
            _tmpImageFileName = null;
          } else {
            _tmpImageFileName = _cursor.getString(_cursorIndexOfImageFileName);
          }
          final String _tmpEmojis;
          if (_cursorIndexOfEmojis == -1) {
            _tmpEmojis = null;
          } else {
            _tmpEmojis = _cursor.getString(_cursorIndexOfEmojis);
          }
          _item_1 = new StickerEntity(_tmpCategoryId,_tmpPackIdentifier,_tmpImageFileName,_tmpEmojis);
          if (_cursorIndexOfId != -1) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item_1.setId(_tmpId);
          }
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
