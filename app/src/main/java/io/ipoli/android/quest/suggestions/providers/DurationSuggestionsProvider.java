package io.ipoli.android.quest.suggestions.providers;

import java.util.ArrayList;
import java.util.List;

import io.ipoli.android.R;
import io.ipoli.android.quest.suggestions.SuggestionDropDownItem;

/**
 * Created by Polina Zhelyazkova <polina@ipoli.io>
 * on 3/27/16.
 */
public class DurationSuggestionsProvider implements SuggestionsProvider {
    private static final int icon = R.drawable.ic_timer_black_18dp;
    private String[] suggestions = {"15 min", "30 min", "1 hour", "1 h and 30 m", "2 hours", "3 hours", "4 hours"};

    @Override
    public List<SuggestionDropDownItem> filter(String text) {
        if(text.toLowerCase().startsWith("for ")) {
            text = text.replaceFirst("for\\s", "");
        }
        List<SuggestionDropDownItem> suggestionItems = new ArrayList<>();
        for (String s : suggestions) {
            if (s.startsWith(text)) {
                suggestionItems.add(new SuggestionDropDownItem(icon, s, "for " + s));
            }
        }
        return suggestionItems;
    }
}
