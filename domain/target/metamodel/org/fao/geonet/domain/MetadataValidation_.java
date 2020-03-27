package org.fao.geonet.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MetadataValidation.class)
public abstract class MetadataValidation_ {

	public static volatile SingularAttribute<MetadataValidation, Integer> numTests;
	public static volatile SingularAttribute<MetadataValidation, Integer> numFailures;
	public static volatile SingularAttribute<MetadataValidation, String> reportContent;
	public static volatile SingularAttribute<MetadataValidation, MetadataValidationId> id;
	public static volatile SingularAttribute<MetadataValidation, ISODate> validationDate;
	public static volatile SingularAttribute<MetadataValidation, String> reportUrl;
	public static volatile SingularAttribute<MetadataValidation, Boolean> required;
	public static volatile SingularAttribute<MetadataValidation, MetadataValidationStatus> status;

}

