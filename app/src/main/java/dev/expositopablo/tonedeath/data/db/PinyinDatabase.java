package dev.expositopablo.tonedeath.data.db;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import dev.expositopablo.tonedeath.data.commons.Pinyin;
import dev.expositopablo.tonedeath.data.db.dao.PinyinDao;

@Database(entities = {Pinyin.class}, version = 1, exportSchema = false)
public abstract class PinyinDatabase extends RoomDatabase{

    private static PinyinDatabase INSTANCE;

    public abstract PinyinDao pinyinDao();

    public static PinyinDatabase getDatabase(final Context context){
        if (INSTANCE == null){
            synchronized (PinyinDatabase.class){
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        PinyinDatabase.class, "pinyin_database")
                        .fallbackToDestructiveMigration()
                        .addCallback(roomDatabaseCallback)
                        .build();
            }
        }
        return INSTANCE;
    }

    private static RoomDatabase.Callback roomDatabaseCallback = new RoomDatabase.Callback(){

        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
        }

        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDBAsync(INSTANCE).execute();
        }
    };

    private static class PopulateDBAsync extends AsyncTask<Void, Void, Void> {
        private final PinyinDao pinyinDao;

        PopulateDBAsync(PinyinDatabase db) {
            this.pinyinDao = db.pinyinDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            List<Pinyin> pinyins = new ArrayList<>();

            pinyins.add(new Pinyin("∅", "a", "a"));
            pinyins.add(new Pinyin("∅", "ai", "a"));
            pinyins.add(new Pinyin("∅", "an", "a"));
            pinyins.add(new Pinyin("∅", "ang", "a"));
            pinyins.add(new Pinyin("∅", "ao", "a"));
            pinyins.add(new Pinyin("b", "a", "a"));
            pinyins.add(new Pinyin("b", "ai", "a"));
            pinyins.add(new Pinyin("b", "an", "a"));
            pinyins.add(new Pinyin("b", "ang", "a"));
            pinyins.add(new Pinyin("b", "ao", "a"));
            pinyins.add(new Pinyin("b", "ei", "e"));
            pinyins.add(new Pinyin("b", "en", "e"));
            pinyins.add(new Pinyin("b", "eng", "e"));
            pinyins.add(new Pinyin("b", "i", "i"));
            pinyins.add(new Pinyin("b", "ian", "a"));
            pinyins.add(new Pinyin("b", "iao", "a"));
            pinyins.add(new Pinyin("b", "ie", "e"));
            pinyins.add(new Pinyin("b", "in", "i"));
            pinyins.add(new Pinyin("b", "ing", "i"));
            pinyins.add(new Pinyin("b", "o", "o"));
            pinyins.add(new Pinyin("b", "u", "u"));
            pinyins.add(new Pinyin("c", "a", "a"));
            pinyins.add(new Pinyin("c", "ai", "a"));
            pinyins.add(new Pinyin("c", "an", "a"));
            pinyins.add(new Pinyin("c", "ang", "a"));
            pinyins.add(new Pinyin("c", "ao", "a"));
            pinyins.add(new Pinyin("c", "e", "e"));
            pinyins.add(new Pinyin("c", "en", "e"));
            pinyins.add(new Pinyin("c", "eng", "e"));
            pinyins.add(new Pinyin("c", "ha", "a"));
            pinyins.add(new Pinyin("c", "hai", "a"));
            pinyins.add(new Pinyin("c", "han", "a"));
            pinyins.add(new Pinyin("c", "hang", "a"));
            pinyins.add(new Pinyin("c", "hao", "a"));
            pinyins.add(new Pinyin("c", "he", "e"));
            pinyins.add(new Pinyin("c", "hen", "e"));
            pinyins.add(new Pinyin("c", "heng", "e"));
            pinyins.add(new Pinyin("c", "hi", "i"));
            pinyins.add(new Pinyin("c", "hong", "o"));
            pinyins.add(new Pinyin("c", "hou", "o"));
            pinyins.add(new Pinyin("c", "hu", "u"));
            pinyins.add(new Pinyin("c", "hua", "a"));
            pinyins.add(new Pinyin("c", "huai", "a"));
            pinyins.add(new Pinyin("c", "huan", "a"));
            pinyins.add(new Pinyin("c", "huang", "a"));
            pinyins.add(new Pinyin("c", "hui", "i"));
            pinyins.add(new Pinyin("c", "hun", "u"));
            pinyins.add(new Pinyin("c", "huo", "o"));
            pinyins.add(new Pinyin("c", "i", "i"));
            pinyins.add(new Pinyin("c", "ong", "o"));
            pinyins.add(new Pinyin("c", "ou", "o"));
            pinyins.add(new Pinyin("c", "u", "u"));
            pinyins.add(new Pinyin("c", "uan", "a"));
            pinyins.add(new Pinyin("c", "ui", "i"));
            pinyins.add(new Pinyin("c", "un", "u"));
            pinyins.add(new Pinyin("c", "uo", "o"));
            pinyins.add(new Pinyin("d", "a", "a"));
            pinyins.add(new Pinyin("d", "ai", "a"));
            pinyins.add(new Pinyin("d", "an", "a"));
            pinyins.add(new Pinyin("d", "ang", "a"));
            pinyins.add(new Pinyin("d", "ao", "a"));
            pinyins.add(new Pinyin("d", "e", "e"));
            pinyins.add(new Pinyin("d", "ei", "e"));
            pinyins.add(new Pinyin("d", "en", "e"));
            pinyins.add(new Pinyin("d", "eng", "e"));
            pinyins.add(new Pinyin("d", "i", "i"));
            pinyins.add(new Pinyin("d", "ia", "a"));
            pinyins.add(new Pinyin("d", "ian", "a"));
            pinyins.add(new Pinyin("d", "iao", "a"));
            pinyins.add(new Pinyin("d", "ie", "e"));
            pinyins.add(new Pinyin("d", "ing", "i"));
            pinyins.add(new Pinyin("d", "iu", "u"));
            pinyins.add(new Pinyin("d", "ong", "o"));
            pinyins.add(new Pinyin("d", "ou", "o"));
            pinyins.add(new Pinyin("d", "u", "u"));
            pinyins.add(new Pinyin("d", "uan", "a"));
            pinyins.add(new Pinyin("d", "ui", "i"));
            pinyins.add(new Pinyin("d", "un", "u"));
            pinyins.add(new Pinyin("d", "uo", "o"));
            pinyins.add(new Pinyin("∅", "e", "e"));
            pinyins.add(new Pinyin("∅", "ei", "e"));
            pinyins.add(new Pinyin("∅", "en", "e"));
            pinyins.add(new Pinyin("∅", "eng", "e"));
            pinyins.add(new Pinyin("∅", "er", "e"));
            pinyins.add(new Pinyin("f", "a", "a"));
            pinyins.add(new Pinyin("f", "an", "a"));
            pinyins.add(new Pinyin("f", "ang", "a"));
            pinyins.add(new Pinyin("f", "ei", "e"));
            pinyins.add(new Pinyin("f", "en", "e"));
            pinyins.add(new Pinyin("f", "eng", "e"));
            pinyins.add(new Pinyin("f", "o", "o"));
            pinyins.add(new Pinyin("f", "ou", "o"));
            pinyins.add(new Pinyin("f", "u", "u"));
            pinyins.add(new Pinyin("g", "a", "a"));
            pinyins.add(new Pinyin("g", "ai", "a"));
            pinyins.add(new Pinyin("g", "an", "a"));
            pinyins.add(new Pinyin("g", "ang", "a"));
            pinyins.add(new Pinyin("g", "ao", "a"));
            pinyins.add(new Pinyin("g", "e", "e"));
            pinyins.add(new Pinyin("g", "ei", "e"));
            pinyins.add(new Pinyin("g", "en", "e"));
            pinyins.add(new Pinyin("g", "eng", "e"));
            pinyins.add(new Pinyin("g", "ong", "o"));
            pinyins.add(new Pinyin("g", "ou", "o"));
            pinyins.add(new Pinyin("g", "u", "u"));
            pinyins.add(new Pinyin("g", "ua", "a"));
            pinyins.add(new Pinyin("g", "uai", "a"));
            pinyins.add(new Pinyin("g", "uan", "a"));
            pinyins.add(new Pinyin("g", "uang", "a"));
            pinyins.add(new Pinyin("g", "ui", "i"));
            pinyins.add(new Pinyin("g", "un", "u"));
            pinyins.add(new Pinyin("g", "uo", "o"));
            pinyins.add(new Pinyin("h", "a", "a"));
            pinyins.add(new Pinyin("h", "ai", "a"));
            pinyins.add(new Pinyin("h", "an", "a"));
            pinyins.add(new Pinyin("h", "ang", "a"));
            pinyins.add(new Pinyin("h", "ao", "a"));
            pinyins.add(new Pinyin("h", "e", "e"));
            pinyins.add(new Pinyin("h", "ei", "e"));
            pinyins.add(new Pinyin("h", "en", "e"));
            pinyins.add(new Pinyin("h", "eng", "e"));
            pinyins.add(new Pinyin("h", "ong", "o"));
            pinyins.add(new Pinyin("h", "ou", "o"));
            pinyins.add(new Pinyin("h", "u", "u"));
            pinyins.add(new Pinyin("h", "ua", "a"));
            pinyins.add(new Pinyin("h", "uai", "a"));
            pinyins.add(new Pinyin("h", "uan", "a"));
            pinyins.add(new Pinyin("h", "uang", "a"));
            pinyins.add(new Pinyin("h", "ui", "i"));
            pinyins.add(new Pinyin("h", "un", "u"));
            pinyins.add(new Pinyin("h", "uo", "o"));
            pinyins.add(new Pinyin("j", "i", "i"));
            pinyins.add(new Pinyin("j", "ia", "a"));
            pinyins.add(new Pinyin("j", "ian", "a"));
            pinyins.add(new Pinyin("j", "iang", "a"));
            pinyins.add(new Pinyin("j", "iao", "a"));
            pinyins.add(new Pinyin("j", "ie", "e"));
            pinyins.add(new Pinyin("j", "in", "i"));
            pinyins.add(new Pinyin("j", "ing", "i"));
            pinyins.add(new Pinyin("j", "iong", "o"));
            pinyins.add(new Pinyin("j", "iu", "u"));
            pinyins.add(new Pinyin("j", "u", "u"));
            pinyins.add(new Pinyin("j", "uan", "a"));
            pinyins.add(new Pinyin("j", "ue", "e"));
            pinyins.add(new Pinyin("j", "un", "u"));
            pinyins.add(new Pinyin("k", "a", "a"));
            pinyins.add(new Pinyin("k", "ai", "a"));
            pinyins.add(new Pinyin("k", "an", "a"));
            pinyins.add(new Pinyin("k", "ang", "a"));
            pinyins.add(new Pinyin("k", "ao", "a"));
            pinyins.add(new Pinyin("k", "e", "e"));
            pinyins.add(new Pinyin("k", "ei", "e"));
            pinyins.add(new Pinyin("k", "en", "e"));
            pinyins.add(new Pinyin("k", "eng", "e"));
            pinyins.add(new Pinyin("k", "ong", "o"));
            pinyins.add(new Pinyin("k", "ou", "o"));
            pinyins.add(new Pinyin("k", "u", "u"));
            pinyins.add(new Pinyin("k", "ua", "a"));
            pinyins.add(new Pinyin("k", "uai", "a"));
            pinyins.add(new Pinyin("k", "uan", "a"));
            pinyins.add(new Pinyin("k", "uang", "a"));
            pinyins.add(new Pinyin("k", "ui", "i"));
            pinyins.add(new Pinyin("k", "un", "u"));
            pinyins.add(new Pinyin("k", "uo", "o"));
            pinyins.add(new Pinyin("l", "a", "a"));
            pinyins.add(new Pinyin("l", "ai", "a"));
            pinyins.add(new Pinyin("l", "an", "a"));
            pinyins.add(new Pinyin("l", "ang", "a"));
            pinyins.add(new Pinyin("l", "ao", "a"));
            pinyins.add(new Pinyin("l", "e", "e"));
            pinyins.add(new Pinyin("l", "ei", "e"));
            pinyins.add(new Pinyin("l", "eng", "e"));
            pinyins.add(new Pinyin("l", "i", "i"));
            pinyins.add(new Pinyin("l", "ia", "a"));
            pinyins.add(new Pinyin("l", "ian", "a"));
            pinyins.add(new Pinyin("l", "iang", "a"));
            pinyins.add(new Pinyin("l", "iao", "a"));
            pinyins.add(new Pinyin("l", "ie", "e"));
            pinyins.add(new Pinyin("l", "in", "i"));
            pinyins.add(new Pinyin("l", "ing", "i"));
            pinyins.add(new Pinyin("l", "iu", "u"));
            pinyins.add(new Pinyin("l", "ong", "o"));
            pinyins.add(new Pinyin("l", "ou", "o"));
            pinyins.add(new Pinyin("l", "u", "u"));
            pinyins.add(new Pinyin("l", "uan", "a"));
            pinyins.add(new Pinyin("l", "un", "u"));
            pinyins.add(new Pinyin("l", "uo", "o"));
            pinyins.add(new Pinyin("l", "ü", "ü"));
            pinyins.add(new Pinyin("l", "üe", "e"));
            pinyins.add(new Pinyin("m", "a", "a"));
            pinyins.add(new Pinyin("m", "ai", "a"));
            pinyins.add(new Pinyin("m", "an", "a"));
            pinyins.add(new Pinyin("m", "ang", "a"));
            pinyins.add(new Pinyin("m", "ao", "a"));
            pinyins.add(new Pinyin("m", "e", "e"));
            pinyins.add(new Pinyin("m", "ei", "e"));
            pinyins.add(new Pinyin("m", "en", "e"));
            pinyins.add(new Pinyin("m", "eng", "e"));
            pinyins.add(new Pinyin("m", "i", "i"));
            pinyins.add(new Pinyin("m", "ian", "a"));
            pinyins.add(new Pinyin("m", "iao", "a"));
            pinyins.add(new Pinyin("m", "ie", "e"));
            pinyins.add(new Pinyin("m", "in", "i"));
            pinyins.add(new Pinyin("m", "ing", "i"));
            pinyins.add(new Pinyin("m", "iu", "u"));
            pinyins.add(new Pinyin("m", "o", "o"));
            pinyins.add(new Pinyin("m", "ou", "o"));
            pinyins.add(new Pinyin("m", "u", "u"));
            pinyins.add(new Pinyin("n", "a", "a"));
            pinyins.add(new Pinyin("n", "ai", "a"));
            pinyins.add(new Pinyin("n", "an", "a"));
            pinyins.add(new Pinyin("n", "ang", "a"));
            pinyins.add(new Pinyin("n", "ao", "a"));
            pinyins.add(new Pinyin("n", "e", "e"));
            pinyins.add(new Pinyin("n", "ei", "e"));
            pinyins.add(new Pinyin("n", "en", "e"));
            pinyins.add(new Pinyin("n", "eng", "e"));
            pinyins.add(new Pinyin("n", "i", "i"));
            pinyins.add(new Pinyin("n", "ian", "a"));
            pinyins.add(new Pinyin("n", "iang", "a"));
            pinyins.add(new Pinyin("n", "iao", "a"));
            pinyins.add(new Pinyin("n", "ie", "e"));
            pinyins.add(new Pinyin("n", "in", "i"));
            pinyins.add(new Pinyin("n", "ing", "i"));
            pinyins.add(new Pinyin("n", "iu", "u"));
            pinyins.add(new Pinyin("n", "ong", "o"));
            pinyins.add(new Pinyin("n", "ou", "o"));
            pinyins.add(new Pinyin("n", "u", "u"));
            pinyins.add(new Pinyin("n", "uan", "a"));
            pinyins.add(new Pinyin("n", "un", "u"));
            pinyins.add(new Pinyin("n", "uo", "o"));
            pinyins.add(new Pinyin("n", "ü", "ü"));
            pinyins.add(new Pinyin("n", "üe", "e"));
            pinyins.add(new Pinyin("∅", "o", "o"));
            pinyins.add(new Pinyin("∅", "ou", "o"));
            pinyins.add(new Pinyin("p", "a", "a"));
            pinyins.add(new Pinyin("p", "ai", "a"));
            pinyins.add(new Pinyin("p", "an", "a"));
            pinyins.add(new Pinyin("p", "ang", "a"));
            pinyins.add(new Pinyin("p", "ao", "a"));
            pinyins.add(new Pinyin("p", "ei", "e"));
            pinyins.add(new Pinyin("p", "en", "e"));
            pinyins.add(new Pinyin("p", "eng", "e"));
            pinyins.add(new Pinyin("p", "i", "i"));
            pinyins.add(new Pinyin("p", "ian", "a"));
            pinyins.add(new Pinyin("p", "iao", "a"));
            pinyins.add(new Pinyin("p", "ie", "e"));
            pinyins.add(new Pinyin("p", "in", "i"));
            pinyins.add(new Pinyin("p", "ing", "i"));
            pinyins.add(new Pinyin("p", "o", "o"));
            pinyins.add(new Pinyin("p", "ou", "o"));
            pinyins.add(new Pinyin("p", "u", "u"));
            pinyins.add(new Pinyin("q", "i", "i"));
            pinyins.add(new Pinyin("q", "ia", "a"));
            pinyins.add(new Pinyin("q", "ian", "a"));
            pinyins.add(new Pinyin("q", "iang", "a"));
            pinyins.add(new Pinyin("q", "iao", "a"));
            pinyins.add(new Pinyin("q", "ie", "e"));
            pinyins.add(new Pinyin("q", "in", "i"));
            pinyins.add(new Pinyin("q", "ing", "i"));
            pinyins.add(new Pinyin("q", "iong", "o"));
            pinyins.add(new Pinyin("q", "iu", "u"));
            pinyins.add(new Pinyin("q", "u", "u"));
            pinyins.add(new Pinyin("q", "uan", "a"));
            pinyins.add(new Pinyin("q", "ue", "e"));
            pinyins.add(new Pinyin("q", "un", "u"));
            pinyins.add(new Pinyin("r", "an", "a"));
            pinyins.add(new Pinyin("r", "ang", "a"));
            pinyins.add(new Pinyin("r", "ao", "a"));
            pinyins.add(new Pinyin("r", "e", "e"));
            pinyins.add(new Pinyin("r", "en", "e"));
            pinyins.add(new Pinyin("r", "eng", "e"));
            pinyins.add(new Pinyin("r", "i", "i"));
            pinyins.add(new Pinyin("r", "ong", "o"));
            pinyins.add(new Pinyin("r", "ou", "o"));
            pinyins.add(new Pinyin("r", "u", "u"));
            pinyins.add(new Pinyin("r", "ua", "a"));
            pinyins.add(new Pinyin("r", "uan", "a"));
            pinyins.add(new Pinyin("r", "ui", "i"));
            pinyins.add(new Pinyin("r", "un", "u"));
            pinyins.add(new Pinyin("r", "uo", "o"));
            pinyins.add(new Pinyin("s", "a", "a"));
            pinyins.add(new Pinyin("s", "ai", "a"));
            pinyins.add(new Pinyin("s", "an", "a"));
            pinyins.add(new Pinyin("s", "ang", "a"));
            pinyins.add(new Pinyin("s", "ao", "a"));
            pinyins.add(new Pinyin("s", "e", "e"));
            pinyins.add(new Pinyin("s", "en", "e"));
            pinyins.add(new Pinyin("s", "eng", "e"));
            pinyins.add(new Pinyin("s", "ha", "a"));
            pinyins.add(new Pinyin("s", "hai", "a"));
            pinyins.add(new Pinyin("s", "han", "a"));
            pinyins.add(new Pinyin("s", "hang", "a"));
            pinyins.add(new Pinyin("s", "hao", "a"));
            pinyins.add(new Pinyin("s", "he", "e"));
            pinyins.add(new Pinyin("s", "hei", "e"));
            pinyins.add(new Pinyin("s", "hen", "e"));
            pinyins.add(new Pinyin("s", "heng", "e"));
            pinyins.add(new Pinyin("s", "hi", "i"));
            pinyins.add(new Pinyin("s", "hou", "o"));
            pinyins.add(new Pinyin("s", "hu", "u"));
            pinyins.add(new Pinyin("s", "hua", "a"));
            pinyins.add(new Pinyin("s", "huai", "a"));
            pinyins.add(new Pinyin("s", "huan", "a"));
            pinyins.add(new Pinyin("s", "huang", "a"));
            pinyins.add(new Pinyin("s", "hui", "i"));
            pinyins.add(new Pinyin("s", "hun", "u"));
            pinyins.add(new Pinyin("s", "huo", "o"));
            pinyins.add(new Pinyin("s", "i", "i"));
            pinyins.add(new Pinyin("s", "ong", "o"));
            pinyins.add(new Pinyin("s", "ou", "o"));
            pinyins.add(new Pinyin("s", "u", "u"));
            pinyins.add(new Pinyin("s", "uan", "a"));
            pinyins.add(new Pinyin("s", "ui", "i"));
            pinyins.add(new Pinyin("s", "un", "u"));
            pinyins.add(new Pinyin("s", "uo", "o"));
            pinyins.add(new Pinyin("t", "a", "a"));
            pinyins.add(new Pinyin("t", "ai", "a"));
            pinyins.add(new Pinyin("t", "an", "a"));
            pinyins.add(new Pinyin("t", "ang", "a"));
            pinyins.add(new Pinyin("t", "ao", "a"));
            pinyins.add(new Pinyin("t", "e", "e"));
            pinyins.add(new Pinyin("t", "eng", "e"));
            pinyins.add(new Pinyin("t", "i", "i"));
            pinyins.add(new Pinyin("t", "ian", "a"));
            pinyins.add(new Pinyin("t", "iao", "a"));
            pinyins.add(new Pinyin("t", "ie", "e"));
            pinyins.add(new Pinyin("t", "ing", "i"));
            pinyins.add(new Pinyin("t", "ong", "o"));
            pinyins.add(new Pinyin("t", "ou", "o"));
            pinyins.add(new Pinyin("t", "u", "u"));
            pinyins.add(new Pinyin("t", "uan", "a"));
            pinyins.add(new Pinyin("t", "ui", "i"));
            pinyins.add(new Pinyin("t", "un", "u"));
            pinyins.add(new Pinyin("t", "uo", "o"));
            pinyins.add(new Pinyin("w", "a", "a"));
            pinyins.add(new Pinyin("w", "ai", "a"));
            pinyins.add(new Pinyin("w", "an", "a"));
            pinyins.add(new Pinyin("w", "ang", "a"));
            pinyins.add(new Pinyin("w", "ei", "e"));
            pinyins.add(new Pinyin("w", "en", "e"));
            pinyins.add(new Pinyin("w", "eng", "e"));
            pinyins.add(new Pinyin("w", "o", "o"));
            pinyins.add(new Pinyin("w", "u", "u"));
            pinyins.add(new Pinyin("x", "i", "i"));
            pinyins.add(new Pinyin("x", "ia", "a"));
            pinyins.add(new Pinyin("x", "ian", "a"));
            pinyins.add(new Pinyin("x", "iang", "a"));
            pinyins.add(new Pinyin("x", "iao", "a"));
            pinyins.add(new Pinyin("x", "ie", "e"));
            pinyins.add(new Pinyin("x", "in", "i"));
            pinyins.add(new Pinyin("x", "ing", "i"));
            pinyins.add(new Pinyin("x", "iong", "o"));
            pinyins.add(new Pinyin("x", "iu", "u"));
            pinyins.add(new Pinyin("x", "u", "u"));
            pinyins.add(new Pinyin("x", "uan", "a"));
            pinyins.add(new Pinyin("x", "ue", "e"));
            pinyins.add(new Pinyin("x", "un", "u"));
            pinyins.add(new Pinyin("y", "a", "a"));
            pinyins.add(new Pinyin("y", "an", "a"));
            pinyins.add(new Pinyin("y", "ang", "a"));
            pinyins.add(new Pinyin("y", "ao", "a"));
            pinyins.add(new Pinyin("y", "e", "e"));
            pinyins.add(new Pinyin("y", "i", "i"));
            pinyins.add(new Pinyin("y", "in", "i"));
            pinyins.add(new Pinyin("y", "ing", "i"));
            pinyins.add(new Pinyin("y", "o", "o"));
            pinyins.add(new Pinyin("y", "ong", "o"));
            pinyins.add(new Pinyin("y", "ou", "o"));
            pinyins.add(new Pinyin("y", "u", "u"));
            pinyins.add(new Pinyin("y", "uan", "a"));
            pinyins.add(new Pinyin("y", "ue", "e"));
            pinyins.add(new Pinyin("y", "un", "u"));
            pinyins.add(new Pinyin("z", "a", "a"));
            pinyins.add(new Pinyin("z", "ai", "a"));
            pinyins.add(new Pinyin("z", "an", "a"));
            pinyins.add(new Pinyin("z", "ang", "a"));
            pinyins.add(new Pinyin("z", "ao", "a"));
            pinyins.add(new Pinyin("z", "e", "e"));
            pinyins.add(new Pinyin("z", "ei", "e"));
            pinyins.add(new Pinyin("z", "en", "e"));
            pinyins.add(new Pinyin("z", "eng", "e"));
            pinyins.add(new Pinyin("z", "ha", "a"));
            pinyins.add(new Pinyin("z", "hai", "a"));
            pinyins.add(new Pinyin("z", "han", "a"));
            pinyins.add(new Pinyin("z", "hang", "a"));
            pinyins.add(new Pinyin("z", "hao", "a"));
            pinyins.add(new Pinyin("z", "he", "e"));
            pinyins.add(new Pinyin("z", "hei", "e"));
            pinyins.add(new Pinyin("z", "hen", "e"));
            pinyins.add(new Pinyin("z", "heng", "e"));
            pinyins.add(new Pinyin("z", "hi", "i"));
            pinyins.add(new Pinyin("z", "hong", "o"));
            pinyins.add(new Pinyin("z", "hou", "o"));
            pinyins.add(new Pinyin("z", "hu", "u"));
            pinyins.add(new Pinyin("z", "hua", "a"));
            pinyins.add(new Pinyin("z", "huai", "a"));
            pinyins.add(new Pinyin("z", "huan", "a"));
            pinyins.add(new Pinyin("z", "huang", "a"));
            pinyins.add(new Pinyin("z", "hui", "i"));
            pinyins.add(new Pinyin("z", "hun", "u"));
            pinyins.add(new Pinyin("z", "huo", "o"));
            pinyins.add(new Pinyin("z", "i", "i"));
            pinyins.add(new Pinyin("z", "ong", "o"));
            pinyins.add(new Pinyin("z", "ou", "o"));
            pinyins.add(new Pinyin("z", "u", "u"));
            pinyins.add(new Pinyin("z", "uan", "a"));
            pinyins.add(new Pinyin("z", "ui", "i"));
            pinyins.add(new Pinyin("z", "un", "u"));
            pinyins.add(new Pinyin("z", "uo", "o"));

            Log.e("ADDING", "" + pinyins.size());

            for (Pinyin pinyin :  pinyins){
                Log.e("ADDING", pinyin.toString());
                pinyinDao.insert(pinyin);
            }
            return null;
        }
    }
}
