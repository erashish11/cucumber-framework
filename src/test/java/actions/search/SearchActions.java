package actions.search;


import actions.UIActions;
import driverconfig.Drivers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static actions.search.SearchForm.SEARCH_BOX;
import static actions.search.SearchForm.SEARCH_BUTTON;


public class SearchActions extends UIActions {
    public static Logger log = LogManager.getLogger(UIActions.class.getName());

    public SearchActions thenenterSearchText(String text) throws Exception {
        find(SEARCH_BOX).sendKeys(text);
        log.info("Entered the search text "+ text);
        return this;
    }

    public SearchActions openApplication(String url) throws Exception {
        navigateTO(url);
        log.info("Launch the URL in Browser "+url);
        return this;
    }

    public SearchActions performSearch() throws Exception {
        find(SEARCH_BUTTON).click();
        log.info("performed the search operation");
        return this;
    }
}
