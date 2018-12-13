package org.academiadecodigo.hackathon.models.dao.JPA;

import org.academiadecodigo.hackathon.models.Review;
import org.academiadecodigo.hackathon.models.dao.ReviewDAO;
import org.springframework.stereotype.Repository;

@Repository
public class JpaReviewDAO extends JpaAbstractDAO<Review> implements ReviewDAO {


    public JpaReviewDAO() {
        super(Review.class);
    }
}
