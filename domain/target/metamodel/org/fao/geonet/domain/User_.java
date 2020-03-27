package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SetAttribute<User, Address> addresses;
	public static volatile SingularAttribute<User, UserSecurity> security;
	public static volatile SetAttribute<User, String> emailAddresses;
	public static volatile SingularAttribute<User, String> surname;
	public static volatile SingularAttribute<User, String> kind;
	public static volatile SingularAttribute<User, Profile> profile;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, String> organisation;
	public static volatile SingularAttribute<User, Integer> id;
	public static volatile SingularAttribute<User, String> lastLoginDate;
	public static volatile SingularAttribute<User, Boolean> enabled;
	public static volatile SingularAttribute<User, String> username;

}

