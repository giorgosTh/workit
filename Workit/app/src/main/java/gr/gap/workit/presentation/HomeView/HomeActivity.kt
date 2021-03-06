package gr.gap.workit.presentation.HomeView

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.SearchView
import android.view.Menu
import android.widget.LinearLayout
import gr.gap.workit.presentation.AddCustomerView.AddCustomerActivity
import gr.gap.workit.presentation.CustomersView.CustomersAdapter
import gr.gap.workit.R
import gr.gap.workit.domain.model.Customer
import gr.gap.workit.presentation.CustomerDetailsView.CustomerDetailsActivity
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.content_main.*

class HomeActivity : AppCompatActivity() {

    private lateinit var searchView: SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)

        buttonAdd.setOnClickListener { navigateToAddCustomer() }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)

        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        searchView = menu?.findItem(R.id.action_search)?.actionView as SearchView
        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName))
        searchView.maxWidth = Int.MAX_VALUE

        return true
    }

    private fun navigateToAddCustomer() {
        val intent = Intent(this, AddCustomerActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.slide_up, R.anim.stay)
    }
}

