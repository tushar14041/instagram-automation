package automation;

import instagram.BaseTest;
import instagram.core_objects.HashTag;
import instagram.core_objects.SingleHashTag;
import instagram.request_handling.tags_interactions.GetTags;
import org.brunocvcunha.instagram4j.requests.payload.InstagramSearchTagsResult;
import org.brunocvcunha.instagram4j.requests.payload.InstagramSearchTagsResultTag;
import org.junit.Test;

import static org.junit.Assert.*;

public class TagSelectionStrategyTest extends BaseTest {
    @Test
    public void t() {
        TagSelectionStrategy t = new TagSelectionStrategy(instagram, "jdm");
    }

}