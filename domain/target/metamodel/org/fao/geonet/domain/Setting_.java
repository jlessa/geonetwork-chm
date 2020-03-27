package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Setting.class)
public abstract class Setting_ {

	public static volatile SingularAttribute<Setting, SettingDataType> dataType;
	public static volatile SingularAttribute<Setting, String> name;
	public static volatile SingularAttribute<Setting, Integer> position;
	public static volatile SingularAttribute<Setting, Character> internal_JpaWorkaround;
	public static volatile SingularAttribute<Setting, String> value;

}

