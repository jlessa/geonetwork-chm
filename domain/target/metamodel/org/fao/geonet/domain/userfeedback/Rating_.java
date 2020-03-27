package org.fao.geonet.domain.userfeedback;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Rating.class)
public abstract class Rating_ {

	public static volatile SingularAttribute<Rating, UserFeedback> userfeedback;
	public static volatile SingularAttribute<Rating, Integer> rating;
	public static volatile SingularAttribute<Rating, Long> id;
	public static volatile SingularAttribute<Rating, RatingCriteria> category;

}

