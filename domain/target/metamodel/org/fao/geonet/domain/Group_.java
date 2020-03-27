package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.MapAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Group.class)
public abstract class Group_ {

	public static volatile SingularAttribute<Group, Integer> referrer;
	public static volatile MapAttribute<Group, String, String> labelTranslations;
	public static volatile SingularAttribute<Group, String> website;
	public static volatile SingularAttribute<Group, Boolean> enableAllowedCategories;
	public static volatile SingularAttribute<Group, MetadataCategory> defaultCategory;
	public static volatile SingularAttribute<Group, String> name;
	public static volatile SingularAttribute<Group, String> description;
	public static volatile SingularAttribute<Group, String> logo;
	public static volatile SingularAttribute<Group, Integer> id;
	public static volatile ListAttribute<Group, MetadataCategory> allowedCategories;
	public static volatile SingularAttribute<Group, String> email;

}

