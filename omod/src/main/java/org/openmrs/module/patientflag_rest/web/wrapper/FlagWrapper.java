package org.openmrs.module.patientflag_rest.web.wrapper;

import java.io.Serializable;
import java.util.Date;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.OpenmrsMetadata;
import org.openmrs.User;
import org.openmrs.module.patientflags.Flag;

public class FlagWrapper extends BaseOpenmrsData implements OpenmrsMetadata, Serializable {
	
	/**
	 * Default serial version
	 */
	private static final long serialVersionUID = 1L;
	private Flag flag;
	
	public FlagWrapper(Flag flag) {
		this.flag = flag;
	}

	public Flag unwrap(FlagWrapper wrapper) {
		return wrapper.flag;
	}

	public FlagWrapper wrap(Flag flag) {
		this.flag = flag;
		return this;
	}

	@Override
	public Integer getId() {
		return this.flag.getId();
	}

	@Override
	public void setId(Integer id) {
		this.flag.setId(id);
	}

	@Override
	public Date getDateRetired() {
		return flag.getDateRetired();
	}

	@Override
	public String getRetireReason() {
		return flag.getRetireReason();
	}

	@Override
	public User getRetiredBy() {
		return flag.getRetiredBy();
	}

	@Override
	public Boolean isRetired() {
		return flag.isRetired();
	}

	@Override
	public void setDateRetired(Date dateRetired) {
		this.flag.setDateRetired(dateRetired);	
	}

	@Override
	public void setRetireReason(String retireReason) {
		this.flag.setRetireReason(retireReason);
		
	}

	@Override
	public void setRetired(Boolean retired) {
		this.flag.setRetired(retired);
		
	}

	@Override
	public void setRetiredBy(User retiredBy) {
		this.flag.setRetiredBy(retiredBy);
		
	}

	@Override
	public String getDescription() {
		return this.flag.getDescription();
	}

	@Override
	public String getName() {
		return this.flag.getName();
	}

	@Override
	public void setDescription(String description) {
		this.flag.setDescription(description);
		
	}

	@Override
	public void setName(String name) {
		this.flag.setName(name);
		
	}

}
