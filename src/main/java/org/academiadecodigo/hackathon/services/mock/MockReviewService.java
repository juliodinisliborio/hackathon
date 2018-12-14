package org.academiadecodigo.hackathon.services.mock;

import org.academiadecodigo.hackathon.models.Review;
import org.academiadecodigo.hackathon.services.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by codecadet on 14/12/2018.
 */
@Service
public class MockReviewService extends AbstractMockService<Review> implements ReviewService{

    private MockPlaceService mockPlaceService;

    @Override
    public List<Review> getPlaceReviews(Integer placeId) {

        return mockPlaceService.getPlaceReviews(placeId);
    }

    @Override
    public Review addReview(Integer placeId, Review review) {

        return mockPlaceService.getPlaceById(placeId).addReview(review);
    }

    public void setMockPlaceService(MockPlaceService mockPlaceService) {
        this.mockPlaceService = mockPlaceService;
    }
}
