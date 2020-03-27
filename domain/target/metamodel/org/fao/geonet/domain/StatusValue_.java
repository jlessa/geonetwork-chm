package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.MapAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(StatusValue.class)
public abstract class StatusValue_ {

	public static volatile MapAttribute<StatusValue, String, String> labelTranslations;
	public static volatile SingularAttribute<StatusValue, StatusValueNotificationLevel> notificationLevel;
	public static volatile SingularAttribute<StatusValue, Character> reserved_JpaWorkaround;
	public static volatile SingularAttribute<StatusValue, String> name;
	public static volatile SingularAttribute<StatusValue, Integer> displayOrder;
	public static volatile SingularAttribute<StatusValue, Integer> id;
	public static volatile SingularAttribute<StatusValue, StatusValueType> type;

}

