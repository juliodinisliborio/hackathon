package org.academiadecodigo.hackathon.services;

import org.academiadecodigo.hackathon.models.Review;

import java.util.List;

public interface ReviewService {

    List<Review> getPlaceReviews(Integer placeId);

    Review addReview(Review review);

    Review editReview(Review review);

    void removeReview(Integer reviewId);
}
