// Copyright (c) 2006  Dustin Sallings <dustin@spy.net>

package net.spy.memcached.protocol.ascii;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import net.spy.memcached.ops.GetOperation;

/**
 * Operation for retrieving data.
 */
class GetOperationImpl extends BaseGetOpImpl implements GetOperation {

	public GetOperationImpl(String key, GetOperation.Callback c) {
		super(c, Collections.singleton(key));
	}

	public GetOperationImpl(Collection<String> k, GetOperation.Callback c) {
		super(c, new HashSet<String>(k));
	}

	@Override
	protected String getCmd() {
		return "get";
	}
}
