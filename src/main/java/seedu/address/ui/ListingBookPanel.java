package seedu.address.ui;

import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.Region;
import seedu.address.commons.core.LogsCenter;
import seedu.address.model.listing.Listing;

/**
 * Panel containing the list of listings.
 */
public class ListingBookPanel extends UiPart<Region> {
    private static final String FXML = "ListingBookPanel.fxml";
    private final Logger logger = LogsCenter.getLogger(ListingBookPanel.class);

    @FXML
    private ListView<Listing> listingBookView;

    /**
     * Creates a {@code ListingBookPanel} with the given {@code ObservableList}.
     */
    public ListingBookPanel(ObservableList<Listing> listingBook) {
        super(FXML);
        listingBookView.setItems(listingBook);
        listingBookView.setCellFactory(listView -> new ListingBookViewCell());
    }

    /**
     * Custom {@code ListCell} that displays the graphics of a {@code Listing} using a {@code ListingCard}.
     */
    class ListingBookViewCell extends ListCell<Listing> {
        @Override
        protected void updateItem(Listing listing, boolean empty) {
            super.updateItem(listing, empty);

            if (empty || listing == null) {
                setGraphic(null);
                setText(null);
            } else {
                setGraphic(new ListingCard(listing, getIndex() + 1).getRoot());
            }
        }
    }

}
