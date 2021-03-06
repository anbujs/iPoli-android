package io.ipoli.android;

import org.threeten.bp.DayOfWeek;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import io.ipoli.android.app.TimeOfDay;
import io.ipoli.android.player.Avatar;
import io.ipoli.android.player.PetAvatar;

/**
 * Created by Venelin Valkov <venelin@curiousily.com>
 * on 6/15/15.
 */
public interface Constants {

    String FACEBOOK_APP_LINK = "https://fb.me/1609677589354576";
    String IPOLI_LOGO_URL = "https://i.imgur.com/Gz3rUi1.png";
    String INVITE_IMAGE_URL = "https://i.imgur.com/Kf0ZrN1.png";
    String SHARE_URL = "http://bit.ly/ipoli-android";
    String TWITTER_USERNAME = "@iPoliHQ";

    int REMIND_DAILY_CHALLENGE_NOTIFICATION_ID = 101;
    int ONGOING_NOTIFICATION_ID = 102;

    int QUEST_TIMER_NOTIFICATION_ID = 201;
    int QUEST_COMPLETE_NOTIFICATION_ID = 202;

    int PET_STATE_CHANGED_NOTIFICATION_ID = 301;

    int DEFAULT_SNOOZE_TIME_MINUTES = 10;

    int QUEST_WITH_NO_DURATION_TIMER_MINUTES = 30;
    int MAX_QUEST_DURATION_HOURS = 4;
    String QUEST_ID_EXTRA_KEY = "quest_id";
    String REPEATING_QUEST_ID_EXTRA_KEY = "repeating_quest_id";

    String CHALLENGE_ID_EXTRA_KEY = "challenge_id";

    String REWARD_ID_EXTRA_KEY = "reward_id";

    String CURRENT_SELECTED_DAY_EXTRA_KEY = "CURRENT_SELECTED_DAY";

    int CALENDAR_EVENT_MIN_DURATION = 15;

    int CALENDAR_EVENT_MIN_SINGLE_LINE_DURATION = 20;

    int CALENDAR_EVENT_MIN_TWO_LINES_DURATION = 30;

    int QUEST_MIN_DURATION = 10;

    int MAX_UNSCHEDULED_QUEST_VISIBLE_COUNT = 3;
    int RESULT_REMOVED = 100;

    String KEY_APP_RUN_COUNT = "APP_RUN_COUNT";

    String KEY_APP_VERSION_CODE = "APP_VERSION_CODE";

    String KEY_PLAYER_ID = "PLAYER_ID";

    String KEY_DAILY_CHALLENGE_DAYS = "DAILY_CHALLENGE_DAYS";

    String KEY_DAILY_CHALLENGE_REMINDER_START_MINUTE = "DAILY_CHALLENGE_REMINDER_START_MINUTE";

    String KEY_DAILY_CHALLENGE_ENABLE_REMINDER = "DAILY_CHALLENGE_ENABLE_REMINDER";

    String KEY_DAILY_CHALLENGE_LAST_COMPLETED = "DAILY_CHALLENGE_LAST_COMPLETED";

    String KEY_ONGOING_NOTIFICATION_ENABLED = "ONGOING_NOTIFICATION_ENABLED";

    String KEY_SHOULD_SHOW_TUTORIAL = "SHOULD_SHOW_TUTORIAL";

    String KEY_SCHEMA_VERSION = "SCHEMA_VERSION";

    String IPOLI_EMAIL = "hi@ipoli.io";

    String API_RESOURCE_SOURCE = "ipoli-android";
    int DEFAULT_PLAYER_XP = 0;
    int DEFAULT_PLAYER_LEVEL = 1;
    long DEFAULT_PLAYER_COINS = 10;
    long DEFAULT_PLAYER_REWARD_POINTS = 10;
    Avatar DEFAULT_PLAYER_AVATAR = Avatar.IPOLI_CLASSIC;
    Set<TimeOfDay> DEFAULT_PLAYER_PRODUCTIVE_TIMES = new HashSet<>(Collections.singletonList(TimeOfDay.MORNING));
    int DEFAULT_PLAYER_WORK_START_MINUTE = 10 * 60;
    int DEFAULT_PLAYER_WORK_END_MINUTE = 18 * 60;
    int DEFAULT_PLAYER_SLEEP_START_MINUTE = 23 * 60;
    int DEFAULT_PLAYER_SLEEP_END_MINUTE = 8 * 60;
    int DEFAULT_PLAYER_COMPLETE_DAILY_QUESTS_MINUTE = 0;

    Set<Integer> DEFAULT_PLAYER_WORK_DAYS = new HashSet<>(Arrays.asList(
            DayOfWeek.MONDAY.getValue(),
            DayOfWeek.TUESDAY.getValue(),
            DayOfWeek.WEDNESDAY.getValue(),
            DayOfWeek.THURSDAY.getValue(),
            DayOfWeek.FRIDAY.getValue()
    ));

    int[] DURATIONS = {10, 15, 20, 25, 30, 60, 90, 120, 180, 240};

    int DEFAULT_MIN_REWARD_PRICE = 10;

    int DEFAULT_DAILY_CHALLENGE_REMINDER_START_MINUTE = 10 * 60;

    boolean DEFAULT_DAILY_CHALLENGE_ENABLE_REMINDER = true;

    boolean DEFAULT_ONGOING_NOTIFICATION_ENABLED = true;
    int[] REMINDER_PREDEFINED_MINUTES = new int[]{0, 10, 15, 30, 60};
    int MIN_FLEXIBLE_TIMES_A_WEEK_COUNT = 1;
    int MAX_FLEXIBLE_TIMES_A_WEEK_COUNT = 6;

    int MIN_FLEXIBLE_TIMES_A_MONTH_COUNT = 1;
    int MAX_FLEXIBLE_TIMES_A_MONTH_COUNT = 15;

    Set<Integer> DEFAULT_DAILY_CHALLENGE_DAYS = new HashSet<>(Arrays.asList(
            DayOfWeek.MONDAY.getValue(),
            DayOfWeek.TUESDAY.getValue(),
            DayOfWeek.WEDNESDAY.getValue(),
            DayOfWeek.THURSDAY.getValue(),
            DayOfWeek.FRIDAY.getValue()
    ));

    int DAILY_CHALLENGE_QUEST_COUNT = 3;
    int DEFAULT_CHALLENGE_DEADLINE_DAY_DURATION = 30;
    int DEFAULT_BAR_COUNT = 4;
    String REMINDER_START_TIME = "reminder_start_time";

    String QUICK_ADD_ADDITIONAL_TEXT = "quick_add_additional_text";
    String DEFAULT_PET_NAME = "Flopsy";
    PetAvatar DEFAULT_PET_AVATAR = PetAvatar.ELEPHANT;
    String DEFAULT_PET_BACKGROUND_PICTURE = "pet_background_1";

    Integer DEFAULT_PET_HP = 80;
    double XP_BONUS_PERCENTAGE_OF_HP = 20.0;
    double COINS_BONUS_PERCENTAGE_OF_HP = 10.0;
    double REWARD_POINTS_BONUS_PERCENTAGE_OF_HP = 10.0;
    int MAX_PET_COIN_BONUS = 10;
    int MAX_PET_REWARD_POINTS_BONUS = 10;

    int MAX_PET_XP_BONUS = 20;

    double XP_TO_PET_HP_RATIO = 13.2;
    int REVIVE_PET_COST = 300;
    String PREDEFINED_CHALLENGE_INDEX = "predefined_challenge_index";
    int RANDOM_SEED = 42; // duh!
    int MAX_TIMES_A_DAY_COUNT = 8;
    int SCHEMA_VERSION = 5;

    double MAX_PENALTY_COEFFICIENT = 0.5;
    double NO_QUESTS_PENALTY_COEFFICIENT = 0.3;
    double IMPORTANT_QUEST_PENALTY_PERCENT = 5;

    String KEY_WIDGET_AGENDA_QUEST_LIST = "widget_agenda_quest_list";
    int API_READ_TIMEOUT_SECONDS = 30;
    String DEFAULT_VIEW_VERSION = "1.0";
    String SOURCE_ANDROID_CALENDAR = "android-calendar";

}