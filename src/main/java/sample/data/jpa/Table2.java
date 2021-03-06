/*
 * Copyright 2018 the original author or authors.
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
package sample.data.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Entity
@IdClass(value = Table2.Table2PK.class)
public class Table2 implements Serializable {

	@Id
	String id1;

	@Id
	String id2;

	public static class Table2PK implements Serializable {

		private String id1;
		private String id2;

		public String getId1() {
			return id1;
		}
		public void setId1(String id1) {
			this.id1 = id1;
		}

		public String getId2() {
			return id2;
		}
		public void setId2(String id2) {
			this.id2 = id2;
		}
	}
}