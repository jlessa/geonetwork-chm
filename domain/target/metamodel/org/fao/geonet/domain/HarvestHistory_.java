package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(HarvestHistory.class)
public abstract class HarvestHistory_ {

	public static volatile SingularAttribute<HarvestHistory, ISODate> harvestDate;
	public static volatile SingularAttribute<HarvestHistory, Character> deleted_JpaWorkaround;
	public static volatile SingularAttribute<HarvestHistory, Integer> id;
	public static volatile SingularAttribute<HarvestHistory, String> harvesterName;
	public static volatile SingularAttribute<HarvestHistory, String> params;
	public static volatile SingularAttribute<HarvestHistory, String> harvesterType;
	public static volatile SingularAttribute<HarvestHistory, Integer> elapsedTime;
	public static volatile SingularAttribute<HarvestHistory, String> harvesterUuid;
	public static volatile SingularAttribute<HarvestHistory, String> info;

}

