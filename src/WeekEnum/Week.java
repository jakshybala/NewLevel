package WeekEnum;

public enum Week {

        MONDAY ("Дуйшомбу - куну Жавада жаны тема отобуз"),
        TUESDAY ("Шейшемби - куну англис тили сабагы"),
        WEDNESDAY ("Шаршемби -  Софт скилл отобуз"),
        THURSDAY ("Бейшемби -  Жавада откон теманы практика кылабыз"),
        FRIDAY ("Жума - куну Жавада жаны тема отобуз"),
        SATURDAY ("Ишемби -  Футбол ойнойбуз"),
        SUNDAY ("Жекшемби  Эс алуу же китеп окуу");

        private final String weekTranslate;

        Week(String weekTranslate) {
            this.weekTranslate = weekTranslate;

        }

        public String getWeekTranslate() {
            return weekTranslate;
        }
    }

