package com.hardik.stikerdemo.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDataBaseNew_Impl extends AppDataBaseNew {
  private volatile CategoryDao _categoryDao;

  private volatile StickerPackDao _stickerPackDao;

  private volatile StickerDao _stickerDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `StickerCategoryEntity` (`id` INTEGER NOT NULL, `searchTerm` TEXT, `title` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `StickerPackEntity` (`identifier` TEXT NOT NULL, `categoryId` INTEGER NOT NULL, `name` TEXT NOT NULL, `publisher` TEXT NOT NULL, `trayImageFile` TEXT, `publisherEmail` TEXT, `publisherWebsite` TEXT, `privacyPolicyWebsite` TEXT, `licenseAgreementWebsite` TEXT, `imageDataVersion` TEXT, `avoidCache` INTEGER, `stickersCount` INTEGER, `previewImages` TEXT NOT NULL, `packUrl` TEXT, `downloadSize` INTEGER, `isPremium` INTEGER NOT NULL, PRIMARY KEY(`identifier`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `StickerEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `categoryId` INTEGER NOT NULL, `packIdentifier` TEXT NOT NULL, `imageFileName` TEXT NOT NULL, `emojis` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f9133518fcbb20321937b5512398bce8')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `StickerCategoryEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `StickerPackEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `StickerEntity`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsStickerCategoryEntity = new HashMap<String, TableInfo.Column>(3);
        _columnsStickerCategoryEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerCategoryEntity.put("searchTerm", new TableInfo.Column("searchTerm", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerCategoryEntity.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStickerCategoryEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStickerCategoryEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStickerCategoryEntity = new TableInfo("StickerCategoryEntity", _columnsStickerCategoryEntity, _foreignKeysStickerCategoryEntity, _indicesStickerCategoryEntity);
        final TableInfo _existingStickerCategoryEntity = TableInfo.read(_db, "StickerCategoryEntity");
        if (! _infoStickerCategoryEntity.equals(_existingStickerCategoryEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "StickerCategoryEntity(com.hardik.stikerdemo.database.StickerCategoryEntity).\n"
                  + " Expected:\n" + _infoStickerCategoryEntity + "\n"
                  + " Found:\n" + _existingStickerCategoryEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsStickerPackEntity = new HashMap<String, TableInfo.Column>(16);
        _columnsStickerPackEntity.put("identifier", new TableInfo.Column("identifier", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerPackEntity.put("categoryId", new TableInfo.Column("categoryId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerPackEntity.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerPackEntity.put("publisher", new TableInfo.Column("publisher", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerPackEntity.put("trayImageFile", new TableInfo.Column("trayImageFile", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerPackEntity.put("publisherEmail", new TableInfo.Column("publisherEmail", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerPackEntity.put("publisherWebsite", new TableInfo.Column("publisherWebsite", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerPackEntity.put("privacyPolicyWebsite", new TableInfo.Column("privacyPolicyWebsite", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerPackEntity.put("licenseAgreementWebsite", new TableInfo.Column("licenseAgreementWebsite", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerPackEntity.put("imageDataVersion", new TableInfo.Column("imageDataVersion", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerPackEntity.put("avoidCache", new TableInfo.Column("avoidCache", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerPackEntity.put("stickersCount", new TableInfo.Column("stickersCount", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerPackEntity.put("previewImages", new TableInfo.Column("previewImages", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerPackEntity.put("packUrl", new TableInfo.Column("packUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerPackEntity.put("downloadSize", new TableInfo.Column("downloadSize", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerPackEntity.put("isPremium", new TableInfo.Column("isPremium", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStickerPackEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStickerPackEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStickerPackEntity = new TableInfo("StickerPackEntity", _columnsStickerPackEntity, _foreignKeysStickerPackEntity, _indicesStickerPackEntity);
        final TableInfo _existingStickerPackEntity = TableInfo.read(_db, "StickerPackEntity");
        if (! _infoStickerPackEntity.equals(_existingStickerPackEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "StickerPackEntity(com.hardik.stikerdemo.database.StickerPackEntity).\n"
                  + " Expected:\n" + _infoStickerPackEntity + "\n"
                  + " Found:\n" + _existingStickerPackEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsStickerEntity = new HashMap<String, TableInfo.Column>(5);
        _columnsStickerEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerEntity.put("categoryId", new TableInfo.Column("categoryId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerEntity.put("packIdentifier", new TableInfo.Column("packIdentifier", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerEntity.put("imageFileName", new TableInfo.Column("imageFileName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStickerEntity.put("emojis", new TableInfo.Column("emojis", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStickerEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStickerEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStickerEntity = new TableInfo("StickerEntity", _columnsStickerEntity, _foreignKeysStickerEntity, _indicesStickerEntity);
        final TableInfo _existingStickerEntity = TableInfo.read(_db, "StickerEntity");
        if (! _infoStickerEntity.equals(_existingStickerEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "StickerEntity(com.hardik.stikerdemo.database.StickerEntity).\n"
                  + " Expected:\n" + _infoStickerEntity + "\n"
                  + " Found:\n" + _existingStickerEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "f9133518fcbb20321937b5512398bce8", "ce5318cec09ebb5825234287aab3958b");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "StickerCategoryEntity","StickerPackEntity","StickerEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `StickerCategoryEntity`");
      _db.execSQL("DELETE FROM `StickerPackEntity`");
      _db.execSQL("DELETE FROM `StickerEntity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CategoryDao stickerCategoryDao() {
    if (_categoryDao != null) {
      return _categoryDao;
    } else {
      synchronized(this) {
        if(_categoryDao == null) {
          _categoryDao = new CategoryDao_Impl(this);
        }
        return _categoryDao;
      }
    }
  }

  @Override
  public StickerPackDao stickerPackDao() {
    if (_stickerPackDao != null) {
      return _stickerPackDao;
    } else {
      synchronized(this) {
        if(_stickerPackDao == null) {
          _stickerPackDao = new StickerPackDao_Impl(this);
        }
        return _stickerPackDao;
      }
    }
  }

  @Override
  public StickerDao stickerDao() {
    if (_stickerDao != null) {
      return _stickerDao;
    } else {
      synchronized(this) {
        if(_stickerDao == null) {
          _stickerDao = new StickerDao_Impl(this);
        }
        return _stickerDao;
      }
    }
  }
}
