package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserGroup.class)
public abstract class UserGroup_ {

	public static volatile SingularAttribute<UserGroup, UserGroupId> id;
	public static volatile SingularAttribute<UserGroup, User> user;
	public static volatile SingularAttribute<UserGroup, Group> group;

}

