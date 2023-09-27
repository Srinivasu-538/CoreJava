e or both of the following attributes to the
<code>Resource</code> configuration for your DBCP 2 DataSource:
</p>
<div class="codeBox"><pre><code>removeAbandonedOnBorrow=true</code></pre></div>
<div class="codeBox"><pre><code>removeAbandonedOnMaintenance=true</code></pre></div>
<p> The default for both of these attributes is <code>false</code>.  Note that
<code>removeAbandonedOnMaintenance</code> has no effect unless pool
maintenance is enabled by setting <code>timeBetweenEvictionRunsMillis</code>
to a positive value.  See the
<a href="https://commons.apache.org/dbcp/configuration.html">
DBCP 2 documentation</a> for full documentation on these attributes.
</p>
