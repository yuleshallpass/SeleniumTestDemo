Question 2 – Automation
Background
Web Disclosure (WD) is a public site where our clients can make their votes public.
The following acceptance criteria have been provided to the team to create some
functionality for a client-facing website:
The user has been given the URL for the WD landing page.

1. Given the user is on the landing page for the WD site
And the Country filter is available
When the user selects “Belgium” from the Country filter list on the left panel
And click on Update button for the country filter list
Then the grid displays all meetings that are associated with the country “Belgium”
And no meetings associated with any other country appear on the list

2. Given the user is on the landing page for the WD site
When the user clicks the Company Name “Activision Blizzard Inc” hyperlink
Then the user lands on the “Activision Blizzard Inc.” vote card page.
And “Activision Blizzard Inc” should appear in the top banner.

As a result, the following set of pages was developed by the team:
WD Site URL: https://viewpoint.glasslewis.com/WD/?siteId=DemoClient
