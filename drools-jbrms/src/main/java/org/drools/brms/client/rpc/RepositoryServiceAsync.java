package org.drools.brms.client.rpc;
/*
 * Copyright 2005 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;

/**

 * This is what the remote service will implement, as a servlet.

 * (in hosted/debug mode, you could also use an implementation that was in-process).

 */

public interface RepositoryServiceAsync
    extends
    RemoteService {

	/** Generated by AsyncInterfaceGenerator hackery */
	public void loadChildCategories(java.lang.String p0, AsyncCallback cb);
	public void loadRuleListForCategories(java.lang.String p0, AsyncCallback cb);
	public void loadTableConfig(java.lang.String p0, AsyncCallback cb);
	public void createCategory(java.lang.String p0, java.lang.String p1, java.lang.String p2, AsyncCallback cb);
	public void createNewRule(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, AsyncCallback cb);
	public void deleteUncheckedRule(java.lang.String p0, java.lang.String p1, AsyncCallback cb);
	public void exportRepository(AsyncCallback cb);
	public void clearRulesRepository(AsyncCallback cb);
	public void listPackages(AsyncCallback cb);
	public void loadRuleAsset(java.lang.String p0, AsyncCallback cb);
	public void loadAssetHistory(java.lang.String p0, AsyncCallback cb);
	public void loadArchivedAssets(AsyncCallback cb);
	public void checkinVersion(org.drools.brms.client.rpc.RuleAsset p0, AsyncCallback cb);
	public void restoreVersion(java.lang.String p0, java.lang.String p1, java.lang.String p2, AsyncCallback cb);
	public void createPackage(java.lang.String p0, java.lang.String p1, AsyncCallback cb);
	public void loadPackageConfig(java.lang.String p0, AsyncCallback cb);
	public void savePackage(org.drools.brms.client.rpc.PackageConfigData p0, AsyncCallback cb);
	public void listAssets(java.lang.String p0, String[] p1, int p2, int p3, AsyncCallback cb);
	public void listStates(AsyncCallback cb);
	public void createState(java.lang.String p0, AsyncCallback cb);
	public void changeState(java.lang.String p0, java.lang.String p1, boolean p2, AsyncCallback cb);
	public void changeAssetPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, AsyncCallback cb);
	public void copyAsset(java.lang.String p0, java.lang.String p1, java.lang.String p2, AsyncCallback cb);
	public void copyPackage(java.lang.String p0, java.lang.String p1, AsyncCallback cb);
	public void listSnapshots(java.lang.String p0, AsyncCallback cb);
	public void createPackageSnapshot(java.lang.String p0, java.lang.String p1, boolean p2, java.lang.String p3, AsyncCallback cb);
	public void copyOrRemoveSnapshot(java.lang.String p0, java.lang.String p1, boolean p2, java.lang.String p3, AsyncCallback cb);
	public void quickFindAsset(java.lang.String p0, int p1, boolean p2, AsyncCallback cb);
	public void removeCategory(java.lang.String p0, AsyncCallback cb);
	public void loadSuggestionCompletionEngine(java.lang.String p0, AsyncCallback cb);
	public void buildPackage(java.lang.String p0, java.lang.String p1, boolean p2, AsyncCallback cb);
	public void buildPackageSource(java.lang.String p0, AsyncCallback cb);
	public void buildAssetSource(org.drools.brms.client.rpc.RuleAsset p0, AsyncCallback cb);
	public void buildAsset(org.drools.brms.client.rpc.RuleAsset p0, AsyncCallback cb);
	public void renameAsset(java.lang.String p0, java.lang.String p1, AsyncCallback cb);
	public void archiveAsset(java.lang.String p0, boolean p1, AsyncCallback cb);
	public void removeAsset(java.lang.String p0, AsyncCallback cb);
	public void renamePackage(java.lang.String p0, java.lang.String p1, AsyncCallback cb);
	public void rebuildSnapshots(AsyncCallback cb);
	public void listRulesInPackage(java.lang.String p0, AsyncCallback cb);
	public void runScenario(java.lang.String p0, org.drools.brms.client.modeldriven.testing.Scenario p1, AsyncCallback cb);


}