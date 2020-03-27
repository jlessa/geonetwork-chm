package org.fao.geonet.domain.userfeedback;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.fao.geonet.domain.Metadata;
import org.fao.geonet.domain.User;
import org.fao.geonet.domain.userfeedback.UserFeedback.UserRatingStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserFeedback.class)
public abstract class UserFeedback_ {

	public static volatile SingularAttribute<UserFeedback, User> approver;
	public static volatile SingularAttribute<UserFeedback, UserFeedback> parent;
	public static volatile SingularAttribute<UserFeedback, String> authorEmail;
	public static volatile SingularAttribute<UserFeedback, Metadata> metadata;
	public static volatile SetAttribute<UserFeedback, Keyword> keywords;
	public static volatile SingularAttribute<UserFeedback, Integer> authorPrivacy;
	public static volatile SingularAttribute<UserFeedback, String> authorOrganization;
	public static volatile SingularAttribute<UserFeedback, User> authorId;
	public static volatile SingularAttribute<UserFeedback, Date> creationDate;
	public static volatile SingularAttribute<UserFeedback, String> uuid;
	public static volatile SingularAttribute<UserFeedback, String> commentText;
	public static volatile SingularAttribute<UserFeedback, String> authorName;
	public static volatile ListAttribute<UserFeedback, Rating> detailedRatingList;
	public static volatile SingularAttribute<UserFeedback, UserRatingStatus> status;

}

