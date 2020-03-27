package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserSecurity.class)
public abstract class UserSecurity_ {

	public static volatile SingularAttribute<UserSecurity, char[]> password;
	public static volatile SingularAttribute<UserSecurity, String> securityNotificationsString;
	public static volatile SingularAttribute<UserSecurity, String> authType;
	public static volatile SingularAttribute<UserSecurity, String> nodeId;

}

