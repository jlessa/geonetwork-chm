package org.fao.geonet.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.MapAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserSearch.class)
public abstract class UserSearch_ {

	public static volatile SingularAttribute<UserSearch, User> creator;
	public static volatile MapAttribute<UserSearch, String, String> labelTranslations;
	public static volatile SingularAttribute<UserSearch, UserSearchFeaturedType> featuredType;
	public static volatile SetAttribute<UserSearch, Group> groups;
	public static volatile SingularAttribute<UserSearch, String> logo;
	public static volatile SingularAttribute<UserSearch, Integer> id;
	public static volatile SingularAttribute<UserSearch, Date> creationDate;
	public static volatile SingularAttribute<UserSearch, String> url;

}

